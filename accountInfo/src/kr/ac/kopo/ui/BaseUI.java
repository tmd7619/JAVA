package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.CustomerService;
import kr.ac.kopo.service.CustomerServiceFactory;


public abstract class BaseUI implements IAccountUI {
	
	
	private Scanner sc ;
	protected CustomerService service;
	
	public BaseUI() {
		sc = new Scanner(System.in);
		service = CustomerServiceFactory.getInstance();
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;	
	}
	
	protected int scanInt(String msg ) {
		int num = Integer.parseInt(scanStr(msg));
		return num;
		
	}

}
