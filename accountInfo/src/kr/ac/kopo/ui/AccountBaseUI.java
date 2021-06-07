package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.Account;

public abstract class AccountBaseUI extends BaseUI {
	
	/*
	 	현재 계좌정보를 저장하는 클래스
	 */

	private static List<Account> currentListAccount; // 현재 계좌정보 
	private static Account currentAccount; // 현재 계좌정보 
	
	public static List<Account> getCurrentListAccount() {
		return currentListAccount;
	}
	public static void setCurrentListAccount(List<Account> currentListAccount) {
		AccountBaseUI.currentListAccount = currentListAccount;
	}
	public static Account getCurrentAccount() {
		return currentAccount;
	}
	public static void setCurrentAccount(Account currentAccount) {
		AccountBaseUI.currentAccount = currentAccount;
	}

	
	 
	
}
