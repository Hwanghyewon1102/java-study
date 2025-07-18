package sec02.exam02;

import java.util.Iterator;
import java.util.Scanner;

public class ForSumFrom1TTo100Exam1 {

	public static void main(String[] args) {
		// 1부터 100까지의 합
		int sum = 0;
		int i = 0;
		
		for (i = 1; i <=100; i++) {
			//sum = sum + i;
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + "의 합 : " + sum); // i는 for문 내부에서만 사용 가능한 지역 변수
		
		// (참고) 무한 루프
		
		int count = 0;
		for (;;) {
			System.out.println("무한반복");
			count ++;
			
			// 실제 사용 예 : 특정 조건을 만족하면 멈추도록
			
			if (count == 6) {
				break;
			}
		}
		
		int i1 = 0;
		int sum1 = 0;
		
		for (i1 = 1; i1 <= 100; i1+=2) {
			sum1 += i1 ;
		}
		
		System.out.println(sum1);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		int i2 = 0;
		int i3 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		if(a % 2 == 0) {
			for (i2 = 0; i2 <= a; i2 += 2) {
				sum2 += i2 ;
			}
			System.out.println(sum2);
		}
		
			else if(a % 2 == 1) {
				for (i3 = 1; i3 <= a ; i3 += 2) {
					sum3 += i3;
						
				}
				System.out.print(sum3);
			}
		
	}
	

	
	
			

}
