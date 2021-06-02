package kr.ac.kopo.ui.account;

import java.util.List;

import kr.ac.kopo.ui.AccountBaseUI;
import kr.ac.kopo.ui.CustomerBaseUI;
import kr.ac.kopo.vo.AccountVO;

public class WithdrawUI extends AccountBaseUI{

	@Override
	public void execute() throws Exception {
		
		while (true) {
			System.out.println("================================================");
			System.out.println("\t" + CustomerBaseUI.getCustomer().getName() + "님의 출금하기");
			System.out.println("================================================");
			String accountNum = scanStr("\t출금하실 계좌번호를 입력해주세요 : ");

			List<AccountVO> list = aservice.searchAccount(accountNum);

			if (list.size() == 0) {
				System.out.println("\t잘못된 계좌정보입니다. 다시입력해주세요.");
				continue;
			} else {
				int amount = scanInt("\t출금하실 금액을 입력해주세요. : ") ;	
				aservice.withdraw(amount, accountNum);
				break;
			}
		}
		
	}

}
