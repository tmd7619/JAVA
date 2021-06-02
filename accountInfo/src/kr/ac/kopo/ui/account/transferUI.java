package kr.ac.kopo.ui.account;

import kr.ac.kopo.ui.AccountBaseUI;
import kr.ac.kopo.ui.CustomerBaseUI;

public class TransferUI extends AccountBaseUI {

	@Override
	public void execute() throws Exception {
		System.out.println("================================================");
		System.out.println("\t" + CustomerBaseUI.getCustomer().getName() + "님의 계좌 이체하기");
		System.out.println("================================================");
		String senderAccountNum = null;
		String receiverBankName = null;
		String receiverAccountNum = null;
		String transferAmount = null; // 이체 금액

		while (true) {
			senderAccountNum = scanStr("\t이체할 본인의 계좌번호를 입력해주세요 : ");
			receiverBankName = scanStr("\t이체할 상대방의 은행명을 입력해주세요 : ");
			receiverAccountNum = scanStr("\t이체할 계좌번호를 입력해주세요 : ");
			transferAmount = scanStr("\t이체할 금액을 입력해주세요 : ");
			
			boolean bool = aservice.transferAccount(senderAccountNum, receiverBankName, receiverAccountNum, transferAmount);
			if(bool) break;
			else continue; 
		}
		System.out.println("\t정상적으로 계좌이체가 완료되었습니다.");
	}

}
