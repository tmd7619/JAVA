package kr.ac.kopo.service;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

// UI -> service -> dao
public class BoardService { // 하나의 DAO외에, 다른 DAO까지 관리하는 클래스 
	
	
	private BoardDAO dao;
	private static int boardNO = 1; // 게시글을 등록할때마다 나오는 게시글번호

	public BoardService() {
		dao = new BoardDAO();	
	}
	
	public void 새글등록서비스(BoardVO newBoard) throws Exception {
		// 등록할 게시물 번호를 추출 
		newBoard.setNo(boardNO++);
		
		// 등록 날짜 추출 
		
		dao.새글등록(newBoard);
	}
	

}
