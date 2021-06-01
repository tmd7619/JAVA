package kr.ac.kopo.ui;

import kr.ac.kopo.vo.CustomerVO;


/*
 *	// 현재 로그인된 정보를 저장하는 클래스 
 */

public abstract class CustomerBaseUI extends BaseUI {
	
	private static CustomerVO ccustomer ;

	public static CustomerVO getCustomer() {
		return ccustomer;
	}

	public static void setCustomer(CustomerVO customer) {
		CustomerBaseUI.ccustomer = customer;
	}
	
	
	

}
