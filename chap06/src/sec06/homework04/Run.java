package sec06.homework04;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ExMethodController controller = new ExMethodController();
        Scanner sc = new Scanner(System.in);

        
        System.out.print("메시지를 입력하세요: ");
        String msg = sc.nextLine();
        controller.printMessage(msg);

        
        int sum = controller.sumTo100();
        System.out.println("1~100까지의 합: " + sum);

        
        System.out.print("정수를 입력하세요(홀/짝 판별): ");
        int number = sc.nextInt();
        System.out.println(number + "은(는) " + controller.checkOddEven(number));

        sc.nextLine(); 

        
        System.out.print("영문자 포함 여부를 확인할 문자열 입력: ");
        String alphaCheckStr = sc.nextLine();
        boolean hasAlpha = controller.containsAlphabet(alphaCheckStr);
        System.out.println("영문자 포함 여부: " + hasAlpha);

        
        System.out.print("문자 개수를 셀 문자열 입력: ");
        String inputStr = sc.nextLine();
        System.out.print("세고 싶은 문자 입력: ");
        char targetChar = sc.nextLine().charAt(0);
        controller.countCharInString(inputStr, targetChar);

        
        System.out.print("출력할 구구단의 단 수(1~9): ");
        int dan = sc.nextInt();
        controller.printGugudan(dan);

       
    }
}
