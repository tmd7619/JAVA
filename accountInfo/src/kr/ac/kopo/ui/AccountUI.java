package kr.ac.kopo.ui;

import kr.ac.kopo.accountui.DeleteUI;
import kr.ac.kopo.accountui.DepositUI;
import kr.ac.kopo.accountui.OpenAccountUI;
import kr.ac.kopo.accountui.SearchAllUI;
import kr.ac.kopo.accountui.SearchBankUI;
import kr.ac.kopo.accountui.SearchNumUI;
import kr.ac.kopo.accountui.TransferUI;
import kr.ac.kopo.accountui.UpdateUI;
import kr.ac.kopo.accountui.WithdrawUI;
import kr.ac.kopo.customerui.LoginUI;
import kr.ac.kopo.customerui.RegisterUI;

public class AccountUI extends BaseUI {

	/*
	 * 메뉴 class
	 * 
	 */
	@Override
	public void execute() throws Exception {
		while (true) { // switch 예외 처리를 해주기 위해 while문에 try/catch 구문을 넣는 것이 좋다.// 안그러면 main catch구문이 처리
			IAccountUI ui = null;

			int type = start();
			
			switch (type) {
			case 1:
				ui = new LoginUI();
				ui.execute();
				break;
			case 2:
				ui = new RegisterUI();
				ui.execute();
				continue;
			case 0:
				break; // 종료
			}
			
			while (true) {
				try {
					int type2 = menu();
					switch (type2) {
					case 1:
						ui = new SearchAllUI(); // 묵시적 형변환
						break;
					case 2:
						ui = new SearchBankUI();
						break;
					case 3:
						ui = new SearchNumUI();
						break;
					case 4:
						ui = new TransferUI();
						break;
					case 5:
						ui = new DepositUI();
						break;
					case 6:
						ui = new WithdrawUI();
						break;
					case 7:
						ui = new UpdateUI();
					case 8:
						ui = new OpenAccountUI();
					case 9:
						ui = new DeleteUI();
					case 0:
						ui = new ExitUI();
						break;
					}
					if (ui != null) {
						ui.execute();
					} else {
						System.out.println("잘못선택하셨습니다.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	private int start() {
		System.out.println("================================================");
		System.out.println("\t 안녕하세요. 통합계좌 관리 프로그램입니다. ");
		System.out.println("================================================");
		System.out.println("\t 1. 로그인 ");
		System.out.println("\t 2. 회원가입 ");
		System.out.println("\t 0. 종료 ");
		int type = scanInt("메뉴 중 원하는 항목을 선택하세요 : ");
		return type;
	}

	private int menu() { // 외부에 보일 이유가 없으니, private 사용

		System.out.println("================================================");
		System.out.println("\t 통합계좌 관리 프로그램 ");
		System.out.println("================================================");
		System.out.println("\t 1. 전체 계좌 조회 ");
		System.out.println("\t 2. 은행별 계좌 조회 ");
		System.out.println("\t 3. 계좌번호로 계좌 조회 ");
		System.out.println("\t 4. 계좌 이체 ");
		System.out.println("\t 5. 계좌 입금");
		System.out.println("\t 6. 계좌 출금 ");
		System.out.println("\t 7. 별칭 설정 ");
		System.out.println("\t 8. 계좌 개설 ");
		System.out.println("\t 9. 계좌 해지 ");
		System.out.println("\t 0. 종료 ");
		System.out.println("================================================");
		int type = scanInt("메뉴 중 원하는 항목을 선택하세요 : ");
		return type;
	}

}