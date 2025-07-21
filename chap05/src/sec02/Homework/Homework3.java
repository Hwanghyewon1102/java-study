package sec02.Homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 :");
		String str = sc.nextLine();
		
		for(;;) {
			if(str.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.print("입력 : " + str);
				System.out.println(str);
				
			}
			return;
			
						
		}
		
	
	}
}
