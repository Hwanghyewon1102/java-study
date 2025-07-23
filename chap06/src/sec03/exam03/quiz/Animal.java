package sec03.exam03.quiz;

public class Animal {

	String kind;
	int age;
	
	
	
	// 종류만 받는 생성자
	public Animal(String kind) {
		this.kind = kind;
		this.age = 1;
	}
	// 나이만 받는 생성자
	public Animal( int age) {
		this.age = age;
		this.kind = "사람";
	}
	// 종류와 나이를 모두 받는 생성자
	public Animal(String kind, int age) {
		this.age = age;
		this.kind = kind;
	}
	
	
	
	// 출력 메소드
    public void info() {
        System.out.println(kind + ": " + age + "살");
    }
}
