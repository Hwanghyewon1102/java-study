package HomeWork;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("가로 크기를 입력하세요.");
		a = sc.nextDouble(); 
		System.out.println("입력된 가로 크기 : " + a);
		
		System.out.println("세로 크기를 입력하세요.");
		b = sc.nextDouble(); 
		System.out.println("입력된 세로 크기 : " + b);
		
		System.out.println("면적 : " + a*b);
		System.out.println("둘레 : " + (a+b)*2);
	}

}
