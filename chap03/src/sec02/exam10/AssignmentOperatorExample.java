package sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		
		result += 10; // result = result + 10;
		System.out.println("result = " + result);
		
		result -= 5; // result = result - 5;
		System.out.println("result = " + result);
		
		result *= 3; // result = result * 3;
		System.out.println("result = " + result);
		
		result /= 5; // result = result / 5;
		System.out.println("result = " + result);
		
		result %= 3; // result = result % 3;
		System.out.println("result = " + result);
		
		
		//Quiz
		//금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
		//최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
		
		// [입력]
		// 5640
		
		// [출력]
		// 500원: 11개
		// 100원 : 1개
		// 50원 : 0개
		// 10원 : 4개
		// 1원 : 0개
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, d, e, f;
		
		System.out.print("금액을 입력하세요");
		a = sc.nextInt();
		
		
		
		b = a / 500 ;
		c = (a - b*500) / 100;
		d = (a - (b*500 + c*100)) / 50;
		e = (a - (b*500 + c*100 + d*50)) / 10;
		f = (a - (b*500 + c*100 + d*50 + e*10))/1;
		
		System.out.println("500원 : " + b + "개 \n" +
							"100원 : " + c + "개 \n" + 
							"50원 : " + d + "개 \n" + 
							"10원 : " + e + "개 \n" + 
							"1원 : " + f + "개" );
		

				
		//		int coin500 = amount / 500;
		//		amount %= 500;
		//		
		//		int coin100 = amount / 100;
		//		amount %= 100;
		//
		//		int coin50 = amount / 50;
		//		amount %= 50;
		//		
		//		int coin10 = amount / 10;
		//		amount %= 10;
		//		
		//		int coin1 = amount; // 남은 금액은 전부 1원
		//		
		//		System.out.println("500원: " + coin500 + "개");
		//		System.out.println("100원: " + coin100 + "개");
		//		System.out.println("50원: " + coin50 + "개");
		//		System.out.println("10원: " + coin10 + "개");
		//		System.out.println("1원: " + coin1 + "개");
				
		
		
		
	}

}
