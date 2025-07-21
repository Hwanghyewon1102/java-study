package sec02.Homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while (true) {
		System.out.print("숫자 (0을 입력하면 종료) :");
		int num = sc.nextInt();
		
		if (num < 0) {
			continue;
		}
			
		if(num == 0) {
			System.out.println(sum);
			break;
		}else {
			
			sum += num;
			}
		}
		

	}
}