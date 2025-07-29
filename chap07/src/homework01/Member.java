package homework01;

public class Member {
	private String memberName;
	
	public Member() {
		this.memberName = "이름 작성";
	}
	   // memberName 변경
    public void changeName(String name) {
        this.memberName = name;
    }

    // memberName 출력
    public void printName() {
        System.out.println("Member Name: " + memberName);
    }
}
