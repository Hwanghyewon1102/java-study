package HomeWork;

import java.util.Scanner;

public class Homewotk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		double a, b;
		
		System.out.println("몸무게를 입력하세요.");
		a = sc.nextDouble(); // 스캐너에서 읽은 한 줄 전체 (엔터 키 이전까지)
		System.out.println("입력된 몸무게 : " + a);
		
		System.out.println("키(m)를 입력하세요.");
		b = sc.nextDouble(); // 스캐너에서 읽은 한 줄 전체 (엔터 키 이전까지)
		System.out.println("입력된 키(m) : " + b);
		
		System.out.println("BMI 지수 : "  + a/(b*b));
		
		
	}

}
