package ch09_class.homepage;

public class Member {
	
	private String stuID ;   // 학번
	private String id;		// 아이디
	private String password;	// 비밀번호
	private String name;		// 이름
	
	
	
	
	
	
	
	
	public Member() {
		
	}
	

	public Member(String id, String password, String name) {
		MemberDB memDB = MemberDB.getinstance();
		this.stuID = memDB.makeStuId();;
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	public Member(String stuID, String id, String password, String name) {
		this.stuID = stuID;
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	public String getStuID() {
		return stuID;
	}

	public void setStuID(String stuID) {
		this.stuID = stuID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [stuID=" + stuID + ", id=" + id + ", password=" + password + ", name=" + name + "]";
	}


	
	
}
