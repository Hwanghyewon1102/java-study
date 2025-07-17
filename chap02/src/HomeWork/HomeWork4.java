package HomeWork;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문자를 입력하세요 : ");
		char str = sc.nextLine().charAt(0);
		System.out.println("입력된 문자 : " + str);
		System.out.println( str +"의 유니코드 : " + (int)str);
		
	}

}
