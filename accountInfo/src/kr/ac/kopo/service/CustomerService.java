package kr.ac.kopo.service;

import kr.ac.kopo.dao.CustomerDAO;
import kr.ac.kopo.vo.CustomerVO;

public class CustomerService {

	private CustomerDAO cdao;

	public CustomerService() {

		cdao = new CustomerDAO();

	}

	public CustomerVO login(String id, String pwd) throws Exception { // 로그인

		CustomerVO customer = cdao.login(id, pwd);

		return customer;
	}

	public CustomerVO overlapCheck(String id) throws Exception { // 아이디 중복 체크 메서드

		CustomerVO customer = cdao.overlapCheck(id);
		return customer;

	}

	public void register(CustomerVO newCustomer) throws Exception{ // 회원가입
		
		cdao.register(newCustomer);
		
	}


}
