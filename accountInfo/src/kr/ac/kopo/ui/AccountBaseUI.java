package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.AccountVO;

public abstract class AccountBaseUI extends BaseUI {
	
	/*
	 	현재 계좌정보를 저장하는 클래스
	 */

	private static List<AccountVO> caccount; // 현재 계좌정보 

	public static List<AccountVO> getCaccount() {
		return caccount;
	}

	public static void setCaccount(List<AccountVO> caccount) {
		AccountBaseUI.caccount = caccount;
	}

	
	 
	
}
