package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		
		// 이스케이프 문자 : 역슬래쉬가 붙은 문자로 특수한 용도로 사용된다.
		// 보통 문자열 작성할 때 이용
		
		System.out.println("번호\t이름\t직업");
		System.out.println("번호\n이름\n직업"); // println에서 ln은 개행(줄 바꿈)을 뜻 함
		System.out.print("행단위출력");
		System.out.print("행단위출력");
		System.out.print(" 행단위출력\n ");
		System.out.print(" 행단위출력\n ");
		System.out.println("우리는 \"우리는\" 우리는");
		System.out.println("봄\\여름\\가을\\겨울");
		
		//뭐지 이게 맞나
	}

}
