package kr.ac.kopo.ui.account;

import kr.ac.kopo.ui.AccountBaseUI;
import kr.ac.kopo.ui.CustomerBaseUI;
import kr.ac.kopo.vo.AccountVO;

public class DeleteUI extends AccountBaseUI{ // 계좌 해지

	@Override
	public void execute() throws Exception {
		
		
		System.out.println("================================================");
		System.out.println("\t" + CustomerBaseUI.getCustomer().getName() + "님의 계좌 해지하기");
		System.out.println("================================================");
		
		while (true) {
			String deleteAccountNum = scanStr("\t해지하실 계좌번호를 입력해주세요 : ");
			AccountVO accountCheck = aservice.searchAccount(deleteAccountNum);
			if (accountCheck.getAccount()== null) {
				System.out.println("\t잘못된 계좌정보입니다. 다시 입력해주세요.");
				System.out.println();
				continue;
			}
			aservice.deleteAccount(deleteAccountNum);
			break;

		}
		
		

		
		
		
	}

}
