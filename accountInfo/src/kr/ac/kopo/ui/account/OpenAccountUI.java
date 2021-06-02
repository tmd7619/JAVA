package kr.ac.kopo.ui.account;

import kr.ac.kopo.ui.AccountBaseUI;
import kr.ac.kopo.ui.CustomerBaseUI;
import kr.ac.kopo.vo.AccountVO;

public class OpenAccountUI extends AccountBaseUI{

	@Override
	public void execute() throws Exception {
		AccountVO na = null;
		
		
		
		System.out.println("================================================");
		System.out.println("\t" + CustomerBaseUI.getCustomer().getName() + "님의 계좌 개설하기");
		System.out.println("================================================");
		
			
		String bankName = scanStr("\t개설하실 은행명을 입력하세요 : ");
		String nickName = scanStr("\t계좌 별칭을 지정해주세요(생략가능) :");	
		
		AccountVO newAccount = new AccountVO();
		newAccount.setBankName(bankName);
		newAccount.setNickname(nickName);
		
		na = aservice.openAccount(newAccount); // 생성된 계좌정보 객체
		System.out.println("================================================");
		System.out.println("================================================");
		System.out.println("================================================");
		
		System.out.println("\t계좌번호 : "+na.getAccount());
		System.out.println("\t은행명 : "+na.getBankName());
		System.out.println("\t예금주 : "+na.getCustomerName());
		System.out.println("\t계좌 개설이 정상적으로 완료되었습니다.");
		
		
	}

}
