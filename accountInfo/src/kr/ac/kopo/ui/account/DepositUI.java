package kr.ac.kopo.ui.account;

import java.util.List;

import kr.ac.kopo.ui.AccountBaseUI;
import kr.ac.kopo.ui.CustomerBaseUI;
import kr.ac.kopo.vo.AccountVO;

public class DepositUI extends AccountBaseUI {

	@Override
	public void execute() throws Exception {
		
		while (true) {
			System.out.println("================================================");
			System.out.println("\t" + CustomerBaseUI.getCustomer().getName() + "님의 입금하기");
			System.out.println("================================================");
			String accountNum = scanStr("\t입금하실 계좌번호를 입력해주세요 : ");

			List<AccountVO> list = aservice.searchAccount(accountNum);

			if (list.size() == 0) {
				System.out.println("\t잘못된 계좌정보입니다. 다시입력해주세요.");
				continue;
			} else {
				int amount = scanInt("\t입금하실 금액을 입력해주세요. : ") ;	
				aservice.deposit(amount, accountNum);
				break;
			}
		}
		
	}

}
