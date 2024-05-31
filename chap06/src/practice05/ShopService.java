package practice05;

public class ShopService {
	private static ShopService ShopService = new ShopService();
	
	private ShopService() {}	//private 로 된 생성자는 외부에서 객체 생성 불가

	static ShopService getInstance() {
		return ShopService;
	}
}
