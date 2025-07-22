package sec02.exam07;

public class ArrayRefernceObjectExample {

	public static void main(String[] args) {
		String[] strArry =new String[3];
		strArry[0] = "Java";
		strArry[1] = "Java";
		strArry[2] = new String("Java");
		
		
		System.out.println(strArry[0] == strArry[1]);
		System.out.println(strArry[1] == strArry[2]);
		System.out.println(strArry[0].equals(strArry[2])); // 내부 문자열을 비교하고 싶을 때
	}

}
