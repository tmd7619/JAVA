package kr.ac.kopo.service;

import kr.ac.kopo.dao.CustomerDAO;
import kr.ac.kopo.vo.CustomerVO;

public class CustomerService {

	private CustomerDAO cdao;

	public CustomerService() {

		cdao = new CustomerDAO();

	}

	public CustomerVO login(String id, String pwd) throws Exception {

		CustomerVO customer = cdao.login(id, pwd);

		return customer;
	}

	public CustomerVO overlapCheck(String id) throws Exception {

		CustomerVO customer = cdao.overlapCheck(id);
		return customer;

	}

	public void register(CustomerVO newCustomer) throws Exception{
		
		cdao.register(newCustomer);
		
	}

}
