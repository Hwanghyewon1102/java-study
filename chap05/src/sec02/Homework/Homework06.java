package sec02.Homework;

import java.util.Iterator;

public class Homework06 {
	public static void main(String[] args) {
        int a;
        
        for (int i = 0; i < 5; i++) {
        	// 공백 출력 5 - i -1 개
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            // 별 출력 2*i + 1개
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
