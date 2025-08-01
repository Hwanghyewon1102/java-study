package Homework;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("선택 : ");
		System.out.println("=== 합격인가? 불합격인가? ===");
		System.out.println("각 과목의 점수를 입력하세요.");

		System.out.println("소프트웨어설계 점수:");
		int desing = sc.nextInt();
		System.out.println("소프트웨어설계 점수:");
		int dev = sc.nextInt();
		System.out.println("소프트웨어설계 점수:");
		int db = sc.nextInt();
		System.out.println("소프트웨어설계 점수:");
		int lang = sc.nextInt();
		System.out.println("소프트웨어설계 점수:");
		int system = sc.nextInt();

		double avg = (desing + dev + db + lang + system) / 5.0;

		// Early Return

		if (desing < 40) {
			System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
		} else if (dev < 40) {
			System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
		} else if (db < 40) {
			System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
		} else if (lang < 40) {
			System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
		} else if (system < 40) {
			System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
		} else if (avg < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		} else {
			System.out.println("합격을 축하합니다!");
		}
	}

}
