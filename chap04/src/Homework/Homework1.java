package Homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("선택 :");
		int a =sc.nextInt();
		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		
	
		 if(3 <= a && a <= 12) {
			System.out.println("당신의 놀이공원 요금은 10,000원입니다.");
		}
		else if(13 <= a && a <= 18) {
			System.out.println("당신의 놀이공원 요금은 20,000원입니다.");
		}
		else if(19 <= a && a <= 64) {
			System.out.println("당신의 놀이공원 요금은 20,000원입니다.");
		}
		else {
			System.out.println("무료입니다");
		}

	}

}
