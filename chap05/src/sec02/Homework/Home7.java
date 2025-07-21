package sec02.Homework;

import java.util.Scanner;

public class Home7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.print("정수 : ");
		int num =sc.nextInt();
		
		if(num < 0) {
			System.out.println("양수가 아닙니다");
			continue;
			
		}else {
			
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 1) {
					System.out.print("박");
				}else {
						System.out.print("수");
					}
				}
			break;
			}
			}
		}
		
		
	}


