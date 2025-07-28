package sec06.homework02;

public class Person {
		// 필드
	    private String name;       
	    private String address;    

	    public String phoneNumber; 
	    public double height;      
	    public double weight;      

	    // 생성자
	    public Person(String name, String address, String phoneNumber, double height, double weight) {
	        this.name = name;
	        this.address = address;
	        this.phoneNumber = phoneNumber;
	        this.height = height;
	        this.weight = weight;
	    }

	    //  메서드 
	    public void printInternalInfo() {
	        System.out.println("이름: " + name);
	        System.out.println("주소: " + address);
	    }
	}
