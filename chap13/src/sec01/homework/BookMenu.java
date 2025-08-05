package sec01.homework;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// BookController 객체 생성
		BookController bookController = new BookController();

    public void mainMenu(){
		  // === 가남 도서관에 오신걸 환영합니다 ===
    	while(true) { 
    	System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
		  // 원하시는 업무의 번호를 선택하세요.
    	// 메뉴 선택 : 
    	// 숫자 입력 받아서 기능 수행하기
    	// 만일 1,2,3,4,5,9 외의 숫자 입력하면 -> "잘못 입력하였습니다. 다시 입력해주세요." 출력
    	System.out.println("원하시는 업무의 번호를 선택하세요");
    	System.out.println("1. 새 도서 추가");
    	System.out.println("2. 도서 전체 조회");
    	System.out.println("3. 도서 검색 조회 ");
    	System.out.println("4. 도서 삭제");
    	System.out.println("5. 도서 오름차순 정렬");
    	System.out.println("9. 종료");
    	
    	    
    	        int num = sc.nextInt();
    	        sc.nextLine(); 

    	        switch(num) {
    	            case 1: insertBook(); break;
    	            case 2: selectList(); break;
    	            case 3: searchBook(); break;
    	            case 4: deleteBook(); break;
    	            case 5: ascBook(); break;
    	            case 9: 
    	                System.out.println("프로그램을 종료합니다.");
    	                return;
    	            default:
    	                System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
    	        }
    	    }
    	}
    

		// 1. 새 도서 추가 view 메소드
		public void insertBook() {
		    System.out.print("도서명을 입력해 주세요 : ");
		    String title = sc.nextLine();
		
		    System.out.print("저자명을 입력해 주세요 : ");
		    String author = sc.nextLine();
		
		    System.out.println("장르를 선택해 주세요 : ");
		    System.out.println("1:인문");
		    System.out.println("2:자연과학");
		    System.out.println("3:어린이");
		    System.out.println("그 외:기타");
		    int category = sc.nextInt();
		
		    String genre;
		    switch (category) {
		        case 1: genre = "인문"; break;
		        case 2: genre = "자연과학"; break;
		        case 3: genre = "어린이"; break;
		        default: genre = "기타"; break;
		    }
		
		    System.out.print("가격을 입력해 주세요 : ");
		    int price = sc.nextInt();
		    Book book = new Book(title, author, genre, price);
		    bookController.insertBook(book);
		}

		// 2. 도서 전체 조회 view 메소드
		public void selectList() { 
			// 1. BookController의 selectList 메소드 호출
			// -> 결과값을 임의의 리스트 bookList생성하여 대입
			List<Book> BookList = bookController.selectList();
			// 2. 조건식 이용
			// 2-1. bookList가 비어있는 경우
			// -> "존재하는 도서가 없습니다."라는 문구 출력
			// 2-2. bookList가 비어있지 않은 경우
			// -> 반복문을 통해 bookList안의 Book 객체들 출력
			if (BookList.isEmpty()) {
				System.out.println("존재하는 도서가 없습니다.");
			} else {
				for (Book b : BookList) {
					System.out.println(b);
				}
			}
		}

		// 3. 도서 검색 조회 view 메소드
    public void searchBook(){
        // 1. 검색할 도서명 키워드 입력 받기(String keyword)
    	System.out.print("검색할 도서명을 입력하세요: ");
    	String keyword = sc.nextLine();
        // 2. BookControllr의 searchBook 메소드로 위의 keyword 전달
        // -> 결과 값을 임의의 리스트 searchList를 생성후 대입
        // -> 키워드가 완전한 도서명이 아니라 도서명의 일부 일 수 있고
        // 일부 키워드를 입력한 경우 해당 키워드를 포함하는 여러 개의 도서 조회됨
        // 단일 객체가 아니라 리스트로 조회
        // 3. 조건식 이용
        // 3-1. searchList가 비어 있는 경우
        // -> "검색 결과가 없습니다."라는 문구 출력
        // 3-2. searchList가 비어 있지 않은 경우
        // -> 반복문으로 searchList 안의 Book 객체 출력
    	List<Book> searchList = bookController.searchBook(keyword);
    	if (searchList.isEmpty()) {
    		System.out.println("검색 결과가 없습니다.");
    	} else {
    		for (Book b : searchList) {
    			System.out.println(b);
    		}
    	}
    }

		// 4. 도서 삭제 view 메소드
    public void deleteBook(){
        // 1. 삭제할 도서명 입력 받기 (String title)
    	System.out.print("삭제할 도서명을 입력하세요: ");
    	String title = sc.nextLine();
        // 2. 삭제할 저자명 입력 받기 (String author)
        // -> 같은 도서명을 가졌지만 저자명이 다른 경우
        // 다른 도서명을 가졌지만 저자명이 같은 경우도 있을 수 있음
    	System.out.print("삭제할 도서의 저자명을 입력하세요: ");
    	String author = sc.nextLine();
        // 3. BookController의 deleteBook() 메소드로 title, author 전달
        // -> 결과값을 임의의 Book(참조변수명 remove) 객체에 대입
        // 4. 조건식 이용
        // 4-1. remove가 존재하는 경우
        // -> "성공적으로 삭제되었습니다." 문구 출력
        // 4-2. remove가 존재하지 않는 경우
        // -> "삭제할 도서를 찾지 못했습니다."라는 문구 출력
        Book removed = bookController.deleteBook(title, author);
        if (removed != null) {
            System.out.println("성공적으로 삭제되었습니다.");
        } else {
            System.out.println("삭제할 도서를 찾지 못했습니다.");
        }
    }
		// 5. 도서 오름차순 정렬 view 메소드
    public void ascBook(){
        // 1. BookController의 ascBook() 메소드 호출
    	int result = bookController.ascBook();
        // 2. 메소드 호출 결과가 1이면 성공, 그 외 실패
        // 3. 성공시 "정렬에 성공하였습니다." 출력 후 전체 목록 조회
        // 4. 실패시 "정렬에 실패하였습니다." 출력
    	    if (result == 1) {
    	        System.out.println("정렬에 성공하였습니다.");
    	        selectList(); 
    	    } else {
    	        System.out.println("정렬에 실패하였습니다.");
    	    }
    }



}
