package sec03.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	// Product가 저장된 List 컬렉션
	private List<Product> list = new ArrayList<Product>();
	// 키보드 입력 Scanner 생성
	private Scanner sc = new Scanner(System.in);
	private int counter; // 상품을 등록할 때 pno 값을 자동으로 부여하기 위해 사용
	
	public void showMenu() {
		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1.등록  |  2.목록   |  3.종료");
			System.out.println("--------------------------------");
			
			System.out.print("선택: ");
			String selectNo = sc.nextLine();
			switch (selectNo) {
				case "1": 
					// Product 등록
					registerProduct();
					break;
				case "2": 
					// 등록된 모든 Product 정보 보기
					showProducts();
					break;
				case "3": 
					// 프로그램 종료
					return;
			}
		}
	}
	

	public void registerProduct() {
		
		System.out.print("등록할 물품을 입력하세요: ");
		String a = sc.nextLine();
		
		System.out.print("물품의 가격을 입력하세요: ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("물품의 재고를 입력하세요: ");
		int c = sc.nextInt();
		sc.nextLine();
				
		
		Product product = new Product();
		product.setName(a);
		product.setPrice(b);
		product.setStock(c);
		counter++;

		list.add(product);
	}

	 public void showProducts() {
		for (int i = 0; i < list.size(); i++) {
			Product product = list.get(i);
			System.out.println(product.getName() + "\n"+ product.getPrice()+ "\n" + product.getStock());
		}
//		for (Product product : list) {
//			System.out.println(product.getName());
//			System.out.println(product.getPrice());
//			System.out.println(product.getStock());
//		}
	}
	
	
	
		public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
