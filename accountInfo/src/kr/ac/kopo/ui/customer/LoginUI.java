package kr.ac.kopo.ui.customer;

import kr.ac.kopo.ui.CustomerBaseUI;
import kr.ac.kopo.vo.CustomerVO;

public class LoginUI extends CustomerBaseUI {

	@Override
	public void execute() throws Exception {
	
		CustomerVO customer = null;
		while (true) {
			System.out.println("================================================");
			String id = scanStr("아이디를 입력하세요 : ");
			String pwd = scanStr("패스워드를 입력하세요 : ");

			customer = cservice.login(id, pwd);

			if (customer == null) {
				System.out.println("잘못된 로그인 정보입니다. 다시입력하세요.");

			} else {
				break;
			}

		}
		System.out.println(customer.getId()+"님 환영합니다!");
		
		CustomerBaseUI.setCustomer(customer); // static 변수에 현재 로그인 정보 저장
		
	}

}
