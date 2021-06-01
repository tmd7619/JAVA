package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
			sql.append(" nvl(nickname,'없음') as nickname, customer_id, credate ");
			sql.append(" from account_info ");

			pstmt = conn.prepareStatement(sql.toString());

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
			sql.append(" nvl(nickname,'없음') as nickname, customer_id, credate ");
			sql.append(" from account_info ");
			sql.append(" where bankname = ? ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, bankName);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				AccountVO account = new AccountVO();
				account.setAccount(rs.getString(1));
				account.setBankName(rs.getString(2));
				account.setCustomerName(rs.getString(3));
				account.setBalance(rs.getString(4));
				account.setNickname(rs.getString(5));
				account.setCustomerID(rs.getString(6));
				account.setCredate(rs.getString(7));

				list.add(account);
			}

		} catch (Exception e) {
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
			sql.append(" nvl(nickname,'없음') as nickname, customer_id, credate ");
			sql.append(" from account_info ");
			sql.append(" where account = ? ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, accountNum);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				AccountVO account = new AccountVO();
				account.setAccount(rs.getString(1));
				account.setBankName(rs.getString(2));
				account.setCustomerName(rs.getString(3));
				account.setBalance(rs.getString(4));
				account.setNickname(rs.getString(5));
				account.setCustomerID(rs.getString(6));
				account.setCredate(rs.getString(7));

				list.add(account);
			}

		} catch (Exception e) {
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
			sql.append("update account_info set nickname = ? where account = ?  ");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, nickName);
			pstmt.setString(2, accountNum);

			pstmt.executeUpdate();

		} catch (Exception e) {
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	
	public void deposit(String amount, String accountNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		
		try {
			conn = new ConnectionFactory().getConnection();
			sql.append("update account_info set balance = ? where account = ?  ");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, Integer.parseInt(amount));
			pstmt.setString(2, accountNum);

			pstmt.executeUpdate();

		} catch (Exception e) {
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
	}
	
	

}
