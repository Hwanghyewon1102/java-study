package sec02.Homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구슬의 개수 :");
		int a = sc.nextInt();
	
		
		int b = a % 2;
		
		if (b==0) {
			System.out.println("구슬의 개수는 짝수입니다");
		}
		else {
			System.out.println("구슬의 개수는 홀수입니다");
		}
	}
}
