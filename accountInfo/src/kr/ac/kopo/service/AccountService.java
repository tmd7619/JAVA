package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.dao.AccountDAO;
import kr.ac.kopo.ui.AccountBaseUI;
import kr.ac.kopo.vo.AccountVO;

public class AccountService {
	
	private AccountDAO adao  ;
	

	public AccountService() {
		

		adao = new AccountDAO();
		
	}
	
	
	public List<AccountVO> searchAll() throws Exception { // 전체 계좌 조회
		
		List<AccountVO> list  = adao.searchAll() ; 
		
		return list;
		
	}
	
	public List<AccountVO> searchBank(String bankName) throws Exception { // 은행별 계좌 조회
		
		List<AccountVO> list  = adao.searchBank(bankName) ; 
		
		return list;
		
	}
	
	public List<AccountVO> searchAccount(String accountNum) throws Exception { // 계좌번호로  게좌 조회
		
		List<AccountVO> list  = adao.searchAccount(accountNum) ; 
		
		return list;
		
	}
	
	
	
	
	public void updateNickname(String nickName, String accounNum) throws Exception { //  별칭 등록 및 수정
		
		adao.updateNickname(nickName,accounNum);	
	
	}
	
	
	public void deposit(int amount, String accountNum ) throws Exception { // 계좌 입금
		List<AccountVO> list  = adao.searchAccount(accountNum) ;
		AccountBaseUI.setCaccount(list); // 입력한 accountNum의 계좌정보 static 변수에 저장
		
		amount = amount + Integer.parseInt(list.get(0).getBalance()); // 입력한 입금액과, 현재 잔액을 더해준다.
		adao.deposit(Integer.toString(amount), accountNum); 
		
		
	}
	
	
	
	
	
	

}
