package homework01;

public class Member {
	private String memberName;
	
	   public void changeName(String name) {
        this.memberName = name;
    }

	public Member() {
		this.memberName = "이름 작성";
	}
	   // memberName 변경
 
    // memberName 출력
    public void printName() {
        System.out.println("Member Name: " + memberName);
    }
}
