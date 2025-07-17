package HomeWork;

import java.util.Scanner;

public class Homewotk1 {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		Double a, b;
		
		System.out.println("몸무게를 입력하세요.(kg)");
		a = sc.nextDouble(); // 스캐너에서 읽은 한 줄 전체 (엔터 키 이전까지)
		System.out.println("입력된 몸무게 : " + a);
		
		System.out.println("키(m)를 입력하세요.");
		b = sc.nextDouble(); // 스캐너에서 읽은 한 줄 전체 (엔터 키 이전까지)
		System.out.println("입력된 키(m) : " + b);
		
		double bmi = a / (b*b);
		
		System.out.println("\n아래는 BMI 지수입니다" );
		System.out.println("BMI 지수 : "  + bmi);
		System.out.printf("BMI 지수 : %.1f \n", bmi);
		System.out.println("BMI 지수 : " + (int) (bmi*10)/10.0);
		System.out.println("BMI 지수 : "  + Math.floor(bmi * 10)/10);
		System.out.println("BMI 지수 : "  + Math.floor(bmi * 10)/10.0);
		
		
	}

}
