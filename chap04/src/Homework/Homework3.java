package Homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("=== 세개의 정수 비교하기 ===");
		System.out.print("첫 번째 정수 : " );
		int a = sc.nextInt();
		System.out.print("두 번째 정수 : " );
		int b = sc.nextInt();
		System.out.print("세 번째 정수 : " );
		int c = sc.nextInt();
		
		int d = a;
		// 2 < 7    2 < 4
		if(a > b) {
		d = b;
		
		 if (b > c) {
			 d = c;
		 }
		}
		System.out.println(d);
	}

}
