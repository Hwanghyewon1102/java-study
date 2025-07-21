package sec02.Homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("수학 : ");
		int b = sc.nextInt();
		
		System.out.print("영어 : ");
		int c = sc.nextInt();
		
		int d = a + b + c;
		System.out.println("합계 : " + d);
		
		double e = d / 3.0;
		System.out.println("평균 : "+e);
		
		System.out.println((a<=60 && b<=60 && c<=60) ? "휴대폰을 바꿀 수 없습니다." 
							: (e>=90)? "휴대폰을 바꿀 수 있습니다" : 
									"휴대폰을 바꿀 수 없습니다");
		

	}

}
