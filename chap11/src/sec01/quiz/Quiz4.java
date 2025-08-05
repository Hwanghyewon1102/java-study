package sec01.quiz;

import java.util.Scanner;

public class Quiz4 {
//	Quiz
//	반 전체 학생이 몇 명인지 입력을 받아 배열을 만들고,
//	우리반 학생들 이름을 입력받아서 모두의 이름을 배열에 추가합니다.
//	전체 학생 중에서 오늘 커피 쏠 사람을 랜덤으로 뽑으려고 해요.
//	Math.random()을 활용해서 학생 한 명을 추출하여 출력하세요.

	public static void main(String[] args) {

		System.out.print("반 전체 학생 수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int studentnum = sc.nextInt();
		sc.nextLine(); // 개행 문자 제거(버퍼 비우기)

		String[] student = new String[studentnum];

		for (int i = 0; i < student.length; i++) {
			String studentname = sc.nextLine();
			
			student[i] = studentname;

		}
		
		// 공식화 :(int) (Math.random() * (최대값 - 최소값 + 1)) + 최소값; 
		int resultstudent = (int) (Math.random() * (student.length - 1)) + 1;
		// = int resultstudent = (int) (Math.random() * length );
		System.out.println("당첨 학생: " + student[resultstudent]);

	}

}
