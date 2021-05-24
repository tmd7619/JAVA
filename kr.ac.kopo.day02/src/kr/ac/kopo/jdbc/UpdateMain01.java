package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 	아이디를 입력 : hong
 	수정할 이름을 입력 : 홍길순
 	 
 
 */

public class UpdateMain01 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// 1단계

			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			
			conn = DriverManager.getConnection(url,user,password);
			
			// 3단계
			Scanner sc = new Scanner(System.in);
			System.out.printf("아이디를 입력  : ");
			String id = sc.nextLine();
			
			System.out.printf("수정할 이름 입력 : ");
			String name = sc.nextLine();
			
			String sql = "update t_test ";
				   sql += " set name = ? ";
				   sql += " where id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2, id);
			
			// 4 단계
			int cnt = pstmt.executeUpdate()	;
			System.out.println(cnt + "개의 행을 수정했다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e ) {
					e.printStackTrace();
				}
			}
		}

	}
}
