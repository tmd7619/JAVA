package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.AccountVO;

public abstract class AccountBaseUI extends BaseUI {
	
	/*
	 	현재 계좌정보를 저장하는 클래스
	 */

	private static List<AccountVO> currentListAccount; // 현재 계좌정보 
	private static AccountVO currentAccount; // 현재 계좌정보 
	
	public static List<AccountVO> getCurrentListAccount() {
		return currentListAccount;
	}
	public static void setCurrentListAccount(List<AccountVO> currentListAccount) {
		AccountBaseUI.currentListAccount = currentListAccount;
	}
	public static AccountVO getCurrentAccount() {
		return currentAccount;
	}
	public static void setCurrentAccount(AccountVO currentAccount) {
		AccountBaseUI.currentAccount = currentAccount;
	}

	
	 
	
}
