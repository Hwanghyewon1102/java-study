package HomeWork;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("문자열을 입력하세요.");
		String str = sc.nextLine();
		
		System.out.println("첫번째 문자열 : " + str.charAt(0) );
		System.out.println("두번째 문자열 : " + str.charAt(1) );
		System.out.println("세번째 문자열 : " + str.charAt(2) );

	}

}
