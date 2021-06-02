package kr.ac.kopo.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import kr.ac.kopo.dao.AccountDAO;
import kr.ac.kopo.ui.AccountBaseUI;
import kr.ac.kopo.ui.CustomerBaseUI;
import kr.ac.kopo.vo.AccountVO;

public class AccountService {

	private AccountDAO adao;

	public AccountService() {

		adao = new AccountDAO();

	}

	public List<AccountVO> searchAll() throws Exception { // 전체 계좌 조회

		List<AccountVO> list = adao.searchAll();

		return list;

	}

	public List<AccountVO> searchBank(String bankName) throws Exception { // 은행별 계좌 조회

		List<AccountVO> list = adao.searchBank(bankName);

		return list;

	}

	public List<AccountVO> searchAccount(String accountNum) throws Exception { // 계좌번호로 게좌 조회

		List<AccountVO> list = adao.searchAccount(accountNum);

		return list;

	}

	public void updateNickname(String nickName, String accounNum) throws Exception { // 별칭 등록 및 수정

		adao.updateNickname(nickName, accounNum);

	}

	public void deposit(int amount, String accountNum) throws Exception { // 계좌 입금
		List<AccountVO> list = adao.searchAccount(accountNum);
		AccountBaseUI.setCaccount(list); // 입력한 accountNum의 계좌정보 static 변수에 저장

		amount = amount + Integer.parseInt(list.get(0).getBalance()); // 입력한 입금액과, 현재 잔액을 더해준다.
		adao.deposit(Integer.toString(amount), accountNum);

	}

	public void withdraw(int amount, String accountNum) throws Exception { // 계좌 출금

		List<AccountVO> list = adao.searchAccount(accountNum);
		AccountBaseUI.setCaccount(list);
		amount = Integer.parseInt(list.get(0).getBalance()) - amount;
		adao.withdraw(Integer.toString(amount), accountNum);

	}

	public AccountVO openAccount(AccountVO newAccount) throws Exception { // 계좌 생성

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		AccountVO na = null;
		Random r = new Random();
		String newAccountNum = null; //난수가 저장될 변수
		
		while (true) {
			
			// 계좌번호 중복체크
			newAccountNum = "1"; // 계좌번호는 1부터 시작함
			
			for(int i = 0 ; i< 13; i ++) {
				
				if(i ==3 || i == 7) {
					newAccountNum += "-"; 
					continue;
				}
				newAccountNum += r.nextInt(10);
			}
			
			String check = adao.overlapCheck(newAccountNum);
			
			if(check != null) continue; // 생성된 난수가, 이미 존재할때 위 과정을 다시 반복
			
			
			// 한달안에 계좌를 생성했는지 확인하는 과정
			String latelyDate = adao.compareDate(); // 가장 최근에 계좌 생성한 날짜
			if (latelyDate == null) {
				System.out.println("\t"+CustomerBaseUI.getCustomer().getName()+"님은 신규계좌로 등록가능하십니다.");
				newAccount.setBankName(CustomerBaseUI.getCustomer().getName()); // 예금주 정보 저장
				newAccount.setAccount(newAccountNum);
				na = adao.openAccount(newAccount);
				break;
			}

			Date ld = sdf.parse(latelyDate); // Date형으로 변환
			Date currentTime = new Date(); // 현재 날짜

			cal.setTime(ld);
			cal.add(Calendar.DATE, 30); // 최근에 생성한 계좌날짜에 30일을 더해줌

			int compare = ld.compareTo(currentTime); // 현재날짜와 30일 더한 생성날짜와 비교

			if (compare < 0) { // 0보다 작으면, 30일 더한생성날짜 < 현재날짜
				System.out.println("아직 계좌 개설 후, 1달이 경과하지 않았습니다. 다음에 이용해주세요.");
				break;
			} else { // 0보다 크면, 30일 더한 생성날짜 > 현재날짜
				
				System.out.println(CustomerBaseUI.getCustomer().getName()+"님은 개설한지 한달이 넘었기에, 계좌개설이 가능합니다.");
				newAccount.setAccount(newAccountNum);
				newAccount.setBankName(CustomerBaseUI.getCustomer().getName()); // 예금주 정보 저장
				na = adao.openAccount(newAccount);
				break;
			}

		}
		return na;
	}

}
