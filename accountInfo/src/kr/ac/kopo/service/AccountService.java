package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.dao.AccountDAO;
import kr.ac.kopo.dao.CustomerDAO;
import kr.ac.kopo.vo.InfoVO;

public class AccountService {
	
	private CustomerDAO cdao ;
	private AccountDAO adao  ;
	

	public AccountService() {
		
		cdao = new CustomerDAO();
		adao = new AccountDAO();
		
	}
	
	
	public List<InfoVO> searchAll() throws Exception {
		
		List<InfoVO> list  = adao.searchAll() ; 
		
		return list;
		
	}
	
	

}
