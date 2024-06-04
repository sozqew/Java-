package sec03;

import java.util.*;
//상품을 관리하는 메인 클래스
public class ProductStorage {
	
	Scanner scanner = new Scanner(System.in);
	private int counter = 0;
	private List<Product> listProduct = new ArrayList<>();
	
	// 메뉴를 보여 주는 메소드
	public void showMenu() {
		while(true) {
			// 메뉴 문자열 출력
			System.out.println("------------------------------------");
			System.out.println("1.등록   |   2.목록   |   3.종료");
			System.out.println("------------------------------------");
			System.out.println("선택: ");
			
			// 키보드를 입력받는 코드
			String selectNo = scanner.nextLine();	// 번호를 읽기
			switch(selectNo) {
			case "1":		// 등록
				registerProduct();
				break;
			case "2":		// 조회
				showProduct();
				break;
			case "3":		// 종료
				return;
			}
		}
	}
	
	// 상품 등록 실행
	public void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);				// 상품 객체에 상품 번호 저장
			
			System.out.println("상품명: ");
			product.setName(scanner.nextLine());// 상품 객체에 상품 이름 저장
			
			System.out.println("가격: ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.println("재고: ");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			listProduct.add(product);
		} catch(Exception e) {
			System.out.println("등록 에러: " + e.getMessage());
		}
	}
	
	// 상품 리스트 조회 실행
	public void showProduct() {
		for(Product product : listProduct) {
			System.out.println(
					product.getPno() + "\t" +
					product.getName() + "\t" + 
					product.getPrice() + "\t" +
					product.getStock()
				);
		}
	}
}
