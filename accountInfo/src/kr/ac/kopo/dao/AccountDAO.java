package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ui.CustomerBaseUI;
import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;
import kr.ac.kopo.vo.AccountVO;

public class AccountDAO {

	public List<AccountVO> searchAll() throws Exception { // 전체 계좌 조회

		List<AccountVO> list = new ArrayList<AccountVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();

		try {

			conn = new ConnectionFactory().getConnection();
			sql.append("select account, bankname, customer_name, balance, ");
			sql.append(" nvl(nickname,'없음') as nickname, customer_id, TO_CHAR(credate,'YY/MM/DD') ");
			sql.append(" from account_info where customer_id = ? ");

			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, CustomerBaseUI.getCustomer().getId());

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				AccountVO account = new AccountVO();
				account.setAccount(rs.getString("account"));
				account.setBankName(rs.getString("bankname"));
				account.setCustomerName(rs.getString("customer_name"));
				account.setBalance(rs.getString(4));
				account.setNickname(rs.getString(5));
				account.setCustomerID(rs.getString(6));
				account.setCredate(rs.getString(7));

				list.add(account);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}

		return list;
	}

	public List<AccountVO> searchBank(String bankName) throws Exception { // 은행별 계좌 조회

		List<AccountVO> list = new ArrayList<AccountVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();

		try {
			conn = new ConnectionFactory().getConnection();
			sql.append("select account, bankname, customer_name, balance, ");
			sql.append(" nvl(nickname,'없음') as nickname, customer_id, TO_CHAR(credate,'YY/MM/DD') as credate ");
			sql.append(" from account_info where customer_id = ? and  ");
			sql.append(" bankname = ? ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, CustomerBaseUI.getCustomer().getId());
			pstmt.setString(2, bankName);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				AccountVO account = new AccountVO();
				account.setAccount(rs.getString(1));
				account.setBankName(rs.getString(2));
				account.setCustomerName(rs.getString(3));
				account.setBalance(rs.getString(4));
				account.setNickname(rs.getString(5));
				account.setCustomerID(rs.getString(6));
				account.setCredate(rs.getString("credate"));

				list.add(account);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);

		}
		
		return list;

	}

	public List<AccountVO> searchAccount(String accountNum) throws Exception { // 계좌번호로 게좌 조회

		List<AccountVO> list = new ArrayList<AccountVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();

		try {
			conn = new ConnectionFactory().getConnection();
			sql.append("select account, bankname, customer_name, balance, ");
			sql.append(" nvl(nickname,'없음') as nickname, customer_id, TO_CHAR(credate,'YY/MM/DD') as credate  ");
			sql.append(" from account_info where customer_id = ? and ");
			sql.append(" account = ? ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, CustomerBaseUI.getCustomer().getId());
			pstmt.setString(2, accountNum);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				AccountVO account = new AccountVO();
				account.setAccount(rs.getString(1));
				account.setBankName(rs.getString(2));
				account.setCustomerName(rs.getString(3));
				account.setBalance(rs.getString(4));
				account.setNickname(rs.getString(5));
				account.setCustomerID(rs.getString(6));
				account.setCredate(rs.getString("credate"));

				list.add(account);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);

		}
		return list;

	}

	public void updateNickname(String nickName, String accountNum) { // 별칭 설정
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();

		try {
			conn = new ConnectionFactory().getConnection();
			sql.append("update account_info set nickname = ? where customer_id = ? and  account = ?  ");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, nickName);
			pstmt.setString(2, CustomerBaseUI.getCustomer().getId());
			pstmt.setString(3, accountNum);

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	
	public void deposit(String amount, String accountNum) { // 계좌 입금
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		
		try {
			conn = new ConnectionFactory().getConnection();
			sql.append("update account_info set balance = ? where customer_id = ? and account = ?  ");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, Integer.parseInt(amount));
			pstmt.setString(2, CustomerBaseUI.getCustomer().getId());
			pstmt.setString(3, accountNum);

			int a = pstmt.executeUpdate(); // 성공하면 1 이상, 실패하면 0을 리턴
			
			if( a >= 1 ) {
				System.out.println("정상적으로 입금이 완료되었습니다. 현재 잔액은 "+amount+"원입니다.");
			}else {
				System.out.println("입금이 정상적으로 처리되지 않았습니다. 다시 시도해주세요.");
				
			}
			

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
	}
	
	public void withdraw(String amount, String accountNum) { // 출금
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		
		try {
			conn = new ConnectionFactory().getConnection();
			sql.append("update account_info set balance = ? where customer_id = ? and account = ? ");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, Integer.parseInt(amount));
			pstmt.setString(2, CustomerBaseUI.getCustomer().getId());
			pstmt.setString(3, accountNum);
			

			int a = pstmt.executeUpdate(); // 성공하면 1 이상, 실패하면 0을 리턴
			
			if( a >= 1 ) {
				System.out.println("정상적으로 출금이 완료되었습니다. 현재 잔액은 "+amount+"원입니다.");
			}else {
				System.out.println("출금이 정상적으로 처리되지 않았습니다. 다시 시도해주세요.");
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	

	public AccountVO openAccount(AccountVO newAccount) { // 계좌개설
		
		Connection conn  = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		
		try {
			conn = new ConnectionFactory().getConnection();
			sql.append(" INSERT INTO ACCOUNT_INFO(ACCOUNT,BANKNAME,CUSTOMER_NAME,CUSTOMER_ID) ");
			sql.append(" VALUES(? , ?, ? ,? ) ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1,newAccount.getAccount());
			pstmt.setString(2,newAccount.getBankName());
			pstmt.setString(3,CustomerBaseUI.getCustomer().getName());
			pstmt.setString(4,CustomerBaseUI.getCustomer().getId());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCClose.close(conn, pstmt);
			
		}
		return newAccount;
	}
	
	public String compareDate() { // 가장 최근에 생성한 계좌의 날짜정보 가져오기
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		String latelyDate = null;
		try {
			conn = new ConnectionFactory().getConnection();
			sql.append("SELECT credate FROM (SELECT CREDATE FROM ACCOUNT_INFO ORDER BY CREDATE DESC) A  ");
			sql.append(" WHERE ROWNUM =1 AND customer_id = ?  ");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, CustomerBaseUI.getCustomer().getId());
			
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
			
				latelyDate = rs.getString("credate");	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
		System.out.println(latelyDate);
		return latelyDate;
	}

	public String overlapCheck(String checkNum) { // 계좌번호 중복체크
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		String check = null;
		try {
			conn = new ConnectionFactory().getConnection();
			sql.append("SELECT ACCOUNT FROM ACCOUNT_INFO   ");
			sql.append(" WHERE ACCOUNT = ? AND customer_id = ?  ");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, checkNum);
			pstmt.setString(2, CustomerBaseUI.getCustomer().getId());
			
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
			
				check = rs.getString("account");	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
		return check;
		
	}

	public void deleteAccount(String deleteNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		String check = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			sql.append("DELETE FROM ACCOUNT_INFO WHERE CUSTOMER_ID = ? AND ACCOUNT = ? ");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, CustomerBaseUI.getCustomer().getId());
			pstmt.setString(2, deleteNum);
			
			int a = pstmt.executeUpdate(); // 성공하면 1 이상, 실패하면 0을 리턴
			
			if( a >= 1 ) {
				System.out.println("\t정상적으로 계좌가 해지되었습니다. 그동안 이용해주셔서 감사합니다.");
			}else {
				System.out.println("\t계좌 해지가 정상적으로 완료되지 않았습니다. 다시 시도해주세요.");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
		
		
	}

	public boolean transferAccount(String senderAccountNum, String receiverBankName, String receiverAccountNum,  // 계좌이체
			String transferAmount) throws Exception {

		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		StringBuilder sql = new StringBuilder();
		StringBuilder sql2 = new StringBuilder();
		
		boolean bool = false;
		
		try {
			
			conn = new ConnectionFactory().getConnection();
			conn.setAutoCommit(false); // AutoCommit을 false로 변경
			
			sql.append("UPDATE ACCOUNT_INFO SET BALANCE = BALANCE - ? WHERE CUSTOMER_ID = ? and account = ? ");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, Integer.parseInt(transferAmount));
			pstmt.setString(2, CustomerBaseUI.getCustomer().getId());
			pstmt.setString(3, senderAccountNum);
			
			pstmt.executeUpdate(); // 성공하면 1 이상, 실패하면 0을 리턴
			
			sql2.append("UPDATE ACCOUNT_INFO SET BALANCE = BALANCE + ? WHERE  account = ? ");
			pstmt2 = conn.prepareStatement(sql2.toString());
			pstmt2.setInt(1, Integer.parseInt(transferAmount));
			pstmt2.setString(2, receiverAccountNum);
			
			pstmt2.executeUpdate() ;
			

			conn.commit(); // 계좌이체가 정상적으로 완료된 경우, 커밋 // 가장 마지막에 수행
			bool = true;
		} catch (Exception e) {
			System.out.println("\t계좌 이체가 정상적으로 완료되지 않았습니다. 다시 시도해주세요.");	
			conn.rollback(); // 계좌이체 도중, 에러가 발생할 경우 롤백
		}finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return bool;
		
		
		
	}

	public boolean checkBalance(String senderAccountNum, String transferAmount) { // 잔액체크
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		boolean bool = false;
		int check  = 0;
		try {
			conn = new ConnectionFactory().getConnection();
			sql.append("SELECT balance - ? as balance FROM ACCOUNT_INFO WHERE CUSTOMER_ID = ? and account = ? ");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, transferAmount);
			pstmt.setString(2, CustomerBaseUI.getCustomer().getId());
			pstmt.setString(3, senderAccountNum);
			
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
			
				check = rs.getInt("balance");	
				
			}
			
			if(check > 0) {
				bool = true;
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return bool;
		
	}

	public List<AccountVO> searchOtderAccount(String receiverAccountNum) {
		List<AccountVO> list = new ArrayList<AccountVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();

		try {
			conn = new ConnectionFactory().getConnection();
			sql.append("select account, bankname, customer_name, balance, ");
			sql.append(" nvl(nickname,'없음') as nickname, customer_id, TO_CHAR(credate,'YY/MM/DD') as credate  ");
			sql.append(" from account_info where account = ? ");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, receiverAccountNum);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				AccountVO account = new AccountVO();
				account.setAccount(rs.getString(1));
				account.setBankName(rs.getString(2));
				account.setCustomerName(rs.getString(3));
				account.setBalance(rs.getString(4));
				account.setNickname(rs.getString(5));
				account.setCustomerID(rs.getString(6));
				account.setCredate(rs.getString("credate"));

				list.add(account);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);

		}
		return list;
	}
	
	
	
	
	

}
