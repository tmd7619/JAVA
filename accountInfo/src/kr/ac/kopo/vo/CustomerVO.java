package kr.ac.kopo.vo;

public class CustomerVO {
	
	private String id; // 아이디
	private String pwd; // 비밀번호
	private String name; // 고객이름
	private int birth; // 생년월일(6자)
	private String createdAt;  // 가입날짜
	
	
	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	String getPwd() {
		return pwd;
	}
	void setPwd(String pwd) {
		this.pwd = pwd;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getBirth() {
		return birth;
	}
	void setBirth(int birth) {
		this.birth = birth;
	}
	String getCreatedAt() {
		return createdAt;
	}
	void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", birth=" + birth + ", createdAt="
				+ createdAt + "]";
	}
	
	
	
	
	

}
