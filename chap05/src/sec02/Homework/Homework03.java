package sec02.Homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		for(;;) {
			
			System.out.print("입력 :");
			String str = sc.nextLine();
			
			if(str.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("입력 :" + str);
				
			}
							
		}
		return;
		
	
	}
}
