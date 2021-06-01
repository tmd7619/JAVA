package kr.ac.kopo.ui.account;

import java.util.List;

import kr.ac.kopo.ui.AccountBaseUI;
import kr.ac.kopo.ui.CustomerBaseUI;
import kr.ac.kopo.vo.AccountVO;

public class SearchAccountUI extends AccountBaseUI {

	@Override
	public void execute() throws Exception {
		while (true) {
			System.out.println("================================================");
			System.out.println("\t" + CustomerBaseUI.getCustomer().getName() + "님의 계좌번호로 계좌 조회하기");
			System.out.println("================================================");
			String accountNum = scanStr("\t조회하실 계좌번호를 입력해주세요 : ");

			List<AccountVO> list = aservice.searchAccount(accountNum);

			if (list.size() == 0) {
				System.out.println("\t잘못된 계좌정보입니다. 다시입력해주세요.");
				continue;
			} else {
				System.out.println("\t" + accountNum + "의 계좌정보");
				System.out.println("은행명\t계좌번호\t별칭\t예금액\t예금주\t계좌생성날짜");
				System.out.println(list.get(0).getBankName()+"\t"+list.get(0).getAccount()
							+"\t"+list.get(0).getNickname()+"\t"+list.get(0).getBalance()+"\t"+list.get(0).getCustomerName()
							+"\t"+list.get(0).getCredate());
				break;
			}
		}

	}
	
}
