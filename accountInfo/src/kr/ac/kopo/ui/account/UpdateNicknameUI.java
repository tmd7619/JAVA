package kr.ac.kopo.ui.account;

import java.util.List;

import kr.ac.kopo.ui.AccountBaseUI;
import kr.ac.kopo.ui.CustomerBaseUI;
import kr.ac.kopo.vo.AccountVO;

public class UpdateNicknameUI extends AccountBaseUI {

	@Override
	public void execute() throws Exception {

		while (true) {
			System.out.println("================================================");
			System.out.println("\t" + CustomerBaseUI.getCustomer().getName() + "님의 계좌 별칭 지정하기");
			System.out.println("================================================");
			String accountNum = scanStr("\t별칭을 설정할 계좌번호를 입력해주세요 : ");

			List<AccountVO> list = aservice.searchAccount(accountNum);

			if (list.size() == 0) {
				System.out.println("\t잘못된 계좌정보입니다. 다시입력해주세요.");
				continue;
			} else {
				String nickName = scanStr("\t등록/재등록할 별칭을 입력해주세요. : ");
				
				aservice.updateNickname(nickName, accountNum);
				System.out.println("\t"+nickName+"으로 별칭이 설정되었습니다.");
				break;
			}
		}
		
		
	}

}
