package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//long(8byte)
		
		long var1 = 10;
		long var2 = 20L; // L을 붙이거나 안 붙이거나 문제 없음
//		long var3 = 20000000000; // 자바 컴파일러는 정수 리터럴을 기본적으로 int 타입으로 해석
		//200억이 int 타입의 범위를 넘기때문에 컴파일 에러 발생
		//컴파일러에게 int 타입이 아니라 long 타이브이 숫자임을 알려줘야 함
		
		long var3 = 20000000000L; // L또는 l을 붙인다 (L의 소문자 대문자 상관 없음)
		
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		

	}

}
