package sec06.homework02;

public class Person {

	    private String name;       // 내부 전용
	    private String address;    // 내부 전용

	    public String phoneNumber; // 외부 접근 가능
	    public double height;      // 외부 접근 가능
	    public double weight;      // 외부 접근 가능

	    // 생성자
	    public Person(String name, String address, String phoneNumber, double height, double weight) {
	        this.name = name;
	        this.address = address;
	        this.phoneNumber = phoneNumber;
	        this.height = height;
	        this.weight = weight;
	    }

	    // 내부에서만 사용하는 정보 출력용 메서드 (테스트용)
	    public void printInternalInfo() {
	        System.out.println("이름: " + name);
	        System.out.println("주소: " + address);
	    }
	}
