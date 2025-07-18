package Homework;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("월 : ");
        int a = sc.nextInt();

        System.out.print("기온 : ");
        int b = sc.nextInt();

        if (a >= 3 && a <= 5) {
            System.out.println("봄입니다.");
        } 
        else if (a >= 6 && a <= 8) {
            if (b >= 35) {
                System.out.println("폭염 경보");
            } else if (b >= 33) {
                System.out.println("폭염 주의보");
            } else {
                System.out.println("여름입니다.");
            }
        } 
        else if (a >= 9 && a <= 11) {
            System.out.println("가을입니다.");
        } 
        else if (a == 12 || a == 1 || a == 2) {
            if (b <= -15) {
                System.out.println("한파 경보");
            } else if (b <= -12) {
                System.out.println("한파 주의보");
            } else {
                System.out.println("겨울입니다.");
            }
        } 
        else {
            System.out.println("해당하는 계절이 없습니다.");
        }

    }
}
