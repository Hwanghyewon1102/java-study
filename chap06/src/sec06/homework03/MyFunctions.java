package sec06.homework03;

public class MyFunctions {
	// 메소드 1: 문자열 두 개를 합쳐서 리턴
    public String concatStrings(String str1, String str2) {
        return str1 + str2;
    }

    // 메소드 2: 정수 두 개의 곱 리턴 (단, 첫 번째 수가 더 작으면 오류 처리)
    public int multiplyIfValid(int a, int b) {
        if (a < b) {
            System.out.println("계산할 수 없습니다.");
            return 0;
        }
        return a * b;
    }

    // 메소드 3: 문자열 두 개가 같은지 확인
    public boolean isEqual(String s1, String s2) {
        return s1.equals(s2);
    }
}