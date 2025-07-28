package sec06.homework03;



public class TestApp {
    public static void main(String[] args) {
        MyFunctions mf = new MyFunctions();

        
        String result1 = mf.concatStrings("Hello, ", "World!");
        System.out.println("문자열 합치기 결과: " + result1);

       
        int result2 = mf.multiplyIfValid(3, 5);  // 잘못된 조건 (3 < 5)
        System.out.println("곱셈 결과: " + result2);

        int result3 = mf.multiplyIfValid(10, 2);  // 정상 조건 (10 > 2)
        System.out.println("곱셈 결과: " + result3);

       
        boolean result4 = mf.isEqual("abc", "abc");
        boolean result5 = mf.isEqual("abc", "def");
        System.out.println("문자열 비교 1: " + result4); // true
        System.out.println("문자열 비교 2: " + result5); // false
    }
}