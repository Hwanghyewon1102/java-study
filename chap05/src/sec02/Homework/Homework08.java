package sec02.Homework;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("문자열 : ");
			String str = sc.nextLine();

			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);

			// 문자 개수 세기
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch)
					count++;
			}

			System.out.println("포함된 개수 : " + count);

			while (true) {
				System.out.print("다시 입력하시겠습니까? : ");
				String ans = sc.nextLine().trim();

				if (ans.equalsIgnoreCase("y")) { // equalsIgnoreCase 대소문자를 구분하지 않는다
					break; // 바깥 while 문으로 다시 돌아감
				} else if (ans.equalsIgnoreCase("n")) {
					System.out.println("프로그램을 종료합니다.");
					return; // main() 메소드 종료
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			}
		}

	}

}
