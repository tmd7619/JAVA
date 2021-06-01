 package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.InfoVO;

public class AccountDAO {
	
	public List<InfoVO> searchAll() throws Exception{ // 전체 계좌 조회
		
		
		List<InfoVO> list = new ArrayList<InfoVO>();
		Connection conn = null; 
		PreparedStatement pstmt = null;
		
		try {
			
			conn = new ConnectionFactory().getConnection() ; 
			
			StringBuilder sql = new StringBuilder() ;
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return list;
		
		
	}
}
