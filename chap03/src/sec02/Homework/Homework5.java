package sec02.Homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호(-) : ");
		String a = sc.nextLine();
		
		if(a.length()==14&&a.contains("-")) {
			char b = a.charAt(7);
			
			String c = ((b=='1' || b=='3') ? "남성입니다" : (b=='2' || b=='4') ? "여성입니다" : "잘못된 입력방식입니다");
			
			System.out.println(c);
		}
	}

}
