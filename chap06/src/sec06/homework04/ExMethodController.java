package sec06.homework04;


	public class ExMethodController {


	    public void printMessage(String message) {
	        System.out.println("메세지: " + message);
	    }

	
	    public int sumTo100() {
	        int sum = 0;
	        for (int i = 1; i <= 100; i++) {
	            sum += i;
	        }
	        return sum;
	    }


	    public String checkOddEven(int num) {
	        return (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
	    }


	    public boolean containsAlphabet(String str) {
	        for (char ch : str.toCharArray()) {
	            if (Character.isAlphabetic(ch)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public void countCharInString(String str, char target) {
	        int count = 0;
	        for (char ch : str.toCharArray()) {
	            if (ch == target) {
	                count++;
	            }
	        }
	        System.out.println("'" + target + "' 문자의 개수: " + count);
	    }

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