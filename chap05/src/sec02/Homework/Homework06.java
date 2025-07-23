package sec02.Homework;

import java.util.Iterator;

public class Homework06 {
	public static void main(String[] args) {
		

		for (int i = 1; i <= 5; i++) { // i = 1, 2, 3, 4, 5
			// 공백 출력 5 - i 개
			for (int j = 1; j <= 5 - i; j++) { // 빈칸 = 4, 3, 2, 1, 0
				System.out.print(" ");
			}
			// 별 출력 2*i - 1개
			for (int j = 1; j <= 2 * i - 1; j++) { // * = 1, 3, 5, 7, 9
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
