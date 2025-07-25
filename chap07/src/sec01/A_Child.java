package sec01;

public class A_Child extends A_Parent {
	private String name;
	
	public A_Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public A_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
}
