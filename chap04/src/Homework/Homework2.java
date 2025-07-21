package Homework;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        char season;
        System.out.print("월 : ");
        int month = sc.nextInt();

        System.out.print("기온 : ");
        int b = sc.nextInt();
        
        // Early Return Pattern
        // 에러나 예외 조건을 먼저 검사하고 처리한 다음, 성공 케이스는 마지막에 처리하는 구조
        // 장점 : 1) 코드 가독서잉 좋아짐 2) 코드의 중첩을 줄일 수 있다
        
//        if(month < 1 || month > 12) {
//        	System.out.println("해당하는 계절이 없습니다.");
//        	return;
//        }
//        
//        if (month >= 3 && month <= 5) {
//        	season = "봄";
//        }else
        
        
        if (month >= 3 && month <= 5) {
            System.out.println("봄입니다.");
        } 
        else if (month >= 6 && month <= 8) {
            if (b >= 35) {
                System.out.println("폭염 경보");
            } else if (b >= 33) {
                System.out.println("폭염 주의보");
            } else {
                System.out.println("여름입니다.");
            }
        } 
        else if (month >= 9 && month <= 11) {
            System.out.println("가을입니다.");
        } 
        else if (month == 12 || month == 1 || month == 2) {
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
