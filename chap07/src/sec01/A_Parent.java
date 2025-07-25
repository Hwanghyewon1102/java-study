package sec01;

public class A_Parent {
	public String notion;
	
	public A_Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public A_Parent(String notion) {
		this.notion = notion;
		System.out.println("Parent(String nation) call");
	}
	
	
	
	
}
