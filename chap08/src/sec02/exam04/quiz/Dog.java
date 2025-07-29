package sec02.exam04.quiz;

public class Dog extends Animal{
	
	public Dog() {
		super("강아지", 4);
	};
	
	@Override
	void sound() {
		System.out.println("멍멍 짖는다.");
		super.sound();
	}
	
	@Override
	void eat() {
		System.out.println("주인이 주는대로 먹는다.");
		super.eat();
	}
}
