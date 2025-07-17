package sec02.Homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요 :");
		String str1 = sc.nextLine();
		
		
		String str2 = ((str1=="간다") ? "간다" : "온다");
		System.out.printf("앵무새 :" + str2);
	}

}
