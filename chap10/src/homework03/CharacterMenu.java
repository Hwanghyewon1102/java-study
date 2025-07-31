package homework03;

import java.util.Scanner;

public class CharacterMenu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        CharacterController controller = new CharacterController();

        System.out.print("문자열 : ");
        String input = sc.nextLine();

        try {
            int result = controller.countAlpha(input);
            System.out.println("'" + input + "'에 포함된 영문자 개수 : " + result);
        } catch (CharCheckException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}