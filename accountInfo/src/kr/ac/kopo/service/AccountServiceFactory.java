package kr.ac.kopo.service;

public class AccountServiceFactory {
	
	private static final AccountService service = new AccountService() ; 
	
	public static AccountService getInstance() {
		
		return service ; 
	}
}
