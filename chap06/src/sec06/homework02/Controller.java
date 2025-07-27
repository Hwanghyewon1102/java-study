package sec06.homework02;

public class Controller {
	public static void main(String[] args) {
        // 사람 인스턴스 2개 생성
        Person p1 = new Person("김철수", "서울시 강남구", "01012345678", 190.5, 100.2);
        Person p2 = new Person("이영희", "부산시 해운대구", "01056434563", 175.4, 65.6);

        // 정보 출력 (외부 접근 가능한 필드만)
        System.out.println("=== 사람 1 정보 ===");
        System.out.println("전화번호: " + p1.phoneNumber);
        System.out.println("키: " + p1.height);
        System.out.println("몸무게: " + p1.weight);

        System.out.println("\n=== 사람 2 정보 ===");
        System.out.println("전화번호: " + p2.phoneNumber);
        System.out.println("키: " + p2.height);
        System.out.println("몸무게: " + p2.weight);
    }
}
