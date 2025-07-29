package sec01.exam06;

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1) --------");
		
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn(); // t
		myClass1.rc.setVolume(5); //t
		
		System.out.println("2)----------------");
		
		MyClass myClass2 = new MyClass(new Audio()); // a
		
		System.out.println("3)----------------");
		
		MyClass myClass3 = new MyClass(); // a
		myClass3.methodA(); // a
		
		System.out.println("4)----------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television()); // t
	}
}



