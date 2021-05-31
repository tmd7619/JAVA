package kr.ac.kopo.ui;

public class AccountIUI extends BaseUI {

	@Override
	public void excute() throws Exception {
		
		
		
		
		
	}

	
	private int menu() { // 외부에 보일 이유가 없으니, private 사용

		System.out.println("================================================");
		System.out.println("\t 통합계좌 관리 프로그램 ");
		System.out.println("================================================");
		System.out.println("\t 1. 전체 게시글 조회 ");
		System.out.println("\t 2. 글번호 조회 ");
		System.out.println("\t 3. 새글등록 ");
		System.out.println("\t 4. 게시글 수정 ");
		System.out.println("\t 5. 게시글 삭제 ");
		System.out.println("\t 0. 종료 ");
		System.out.println("================================================");
		int type = scanInt("메뉴 중 원하는 항목을 선택하세요 : ");
		return type;
	};
	
	
	
	
	
}
