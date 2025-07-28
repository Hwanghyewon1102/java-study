package sec06.homework03;

public class MyFunctions {
	
    public String concatStrings(String str1, String str2) {
        return str1 + str2;
    }

   
    public int multiplyIfValid(int a, int b) {
        if (a < b) {
            System.out.println("계산할 수 없습니다.");
            return 0;
        }
        return a * b;
    }

    
    public boolean isEqual(String s1, String s2) {
        return s1.equals(s2);
    }
}