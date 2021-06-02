package kr.ac.kopo.ui.account;

import java.util.List;

import kr.ac.kopo.ui.AccountBaseUI;
import kr.ac.kopo.ui.CustomerBaseUI;
import kr.ac.kopo.vo.AccountVO;

public class DeleteUI extends AccountBaseUI{ // 계좌 해지

	@Override
	public void execute() throws Exception {
		
		
		while (true) {
			System.out.println("================================================");
			System.out.println("\t" + CustomerBaseUI.getCustomer().getName() + "님의 계좌 해지하기");
			System.out.println("================================================");
			
			String deleteNum = scanStr("\t해지할 계좌번호를 입력해주세요 : ");
			
			List<AccountVO> list = aservice.searchAccount(deleteNum);

			if (list.size() == 0) {
				System.out.println("\t잘못된 계좌정보입니다. 다시입력해주세요.");
				continue;
			} else {
				aservice.deleteAccount(deleteNum);
				break;
			}

		}
		
		
		
	}

}
