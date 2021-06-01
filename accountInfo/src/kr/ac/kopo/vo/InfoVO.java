package kr.ac.kopo.vo;

public class InfoVO {
	
	private String account ; // 계좌번호
	private String bank; // 은행명
	private String name; // 계좌주명
	private String balance; // 잔액
	private String nickname; // 별칭
	
	
	String getAccount() {
		return account;
	}
	void setAccount(String account) {
		this.account = account;
	}
	String getBank() {
		return bank;
	}
	void setBank(String bank) {
		this.bank = bank;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getBalance() {
		return balance;
	}
	void setBalance(String balance) {
		this.balance = balance;
	}
	String getNickname() {
		return nickname;
	}
	void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		return "InfoVO [account=" + account + ", bank=" + bank + ", name=" + name + ", balance=" + balance
				+ ", nickname=" + nickname + "]";
	}
	
	
	
	
	
	
	
	

}
