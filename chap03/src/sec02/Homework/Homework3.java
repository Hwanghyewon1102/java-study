package sec02.Homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("친구 수 :");
		int a = sc.nextInt();
		
		System.out.print("사탕의 수 :");
		int b = sc.nextInt();
		
		int c = 0, d = 0;
		
		c = b / a;
		d = b-c*a;
		
		System.out.println("1인당 사탕 개수 : " + c +"개");
		System.out.println("남는 사탕 개수 : " + d+"개");
	}
}
