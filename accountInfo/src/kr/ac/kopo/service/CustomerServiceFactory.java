package kr.ac.kopo.service;

public class CustomerServiceFactory {

	private static final CustomerService service = new CustomerService(); 
	
	public static CustomerService getInstance() {
		
		return service;
	}
	
}
