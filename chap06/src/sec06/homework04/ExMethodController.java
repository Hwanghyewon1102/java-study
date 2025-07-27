package sec06.homework04;


	public class ExMethodController {

	    // 1. 전달된 메시지를 출력하는 메서드
	    public void printMessage(String message) {
	        System.out.println("메세지: " + message);
	    }

	    // 2. 1~100까지의 합을 반환하는 메서드
	    public int sumTo100() {
	        int sum = 0;
	        for (int i = 1; i <= 100; i++) {
	            sum += i;
	        }
	        return sum;
	    }

	    // 3. 전달된 정수가 홀수인지 짝수인지 반환하는 메서드
	    public String checkOddEven(int num) {
	        return (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
	    }

	    // 4. 전달된 문자열에 영문자가 포함되어 있는지 확인
	    public boolean containsAlphabet(String str) {
	        for (char ch : str.toCharArray()) {
	            if (Character.isAlphabetic(ch)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    // 5. 문자열과 문자를 받아 해당 문자가 문자열에 몇 개 있는지 출력
	    public void countCharInString(String str, char target) {
	        int count = 0;
	        for (char ch : str.toCharArray()) {
	            if (ch == target) {
	                count++;
	            }
	        }
	        System.out.println("'" + target + "' 문자의 개수: " + count);
	    }

	    // 6. 전달된 정수의 구구단을 출력하는 메서드
	    public void printGugudan(int dan) {
	        if (dan < 1 || dan > 9) {
	            System.out.println("1~9 사이의 정수를 입력하세요.");
	            return;
	        }
	        System.out.println("구구단 " + dan + "단:");
	        for (int i = 1; i <= 9; i++) {
	            System.out.println(dan + " x " + i + " = " + (dan * i));
	        }
	    }
	}