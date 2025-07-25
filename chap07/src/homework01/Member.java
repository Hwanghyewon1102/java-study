package homework01;

public class Member {
	public String memberld;
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	public Member (String memberId, String memberPwd, String memberName, int age, char gender, String phone, String email) {
		this.memberld = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
}
