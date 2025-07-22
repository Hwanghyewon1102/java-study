package sec02.Homework;

import java.util.Iterator;
import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1 ~ 10 사이 수 입력");
			int num = sc.nextInt();
			if (num < 0) {
				System.out.println("양수만 입력해주세요");
			}

			else if (num == 0) {
				break;
			}

			else if (1 <= num && num < 10) {
				for (int i = num; i < 10; i++) {
					for (int j = 1; j < 10; j++) {
						System.out.println(i + "*" + j + "=" + i * j);
					}
				}

			} else {
				System.out.println("9이하의 숫자를 입력해주세요");
			}

		}
	}
}
