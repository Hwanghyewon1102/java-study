package sec02.Homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		while (true) {
			System.out.print("정수 (1 ~50)사이의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num < 0 || num > 50) {
				System.out.println("1~50 사이의 정수를 입력하세요");
			} else {

				for (int i = 0; i <= num; i += 2) {
					sum += i;
				}

				System.out.println("합계 : " + sum);

			}

		}

	}

}
