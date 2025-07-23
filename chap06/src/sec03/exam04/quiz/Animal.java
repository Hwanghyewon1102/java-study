package sec03.exam04.quiz;



//Quiz
//다른 생성자를 호출하는 this()를 써서 리팩토링 해보세요.



public class Animal {

	String kind;
	int age;
	
	
	
	// 종류만 받는 생성자	(기본 종류 : 사람)
	public Animal(String kind) {
//		this.kind = kind;
//		this.age = 1;
		this(kind, 1);
	}
	// 나이만 받는 생성자 (기본 종류 : 사람)
	public Animal( int age) {
//		this.age = age;
//		this.kind = "사람";
		this("사람", age);
	}
	// 종류와 나이를 모두 받는 생성자 (최종 목적지 한 군데에서만 초기화 수행)
	public Animal(String kind, int age) {
		this.age = age;
		this.kind = kind;
	}
	
	
	
	// 출력 메소드
    public void info() {
        System.out.println(kind + ": " + age + "살");
    }
}
