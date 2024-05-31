package sec01;

public class ObjectExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//obj1 obj2 서로 다른 물리적인 공간에서 독립적으로 나누어 진다
		//obj1 obj2 주소가 같다면 서로 이름이 다른 변수이지만 같다고 말할 수 는 있다
		
		boolean result1 = obj1.equals(obj2);	//obj1 obj2 같은지 비교
		System.out.println("result1: " + result1);
		
		boolean result2 = obj2 == obj2;	//obj1 obj2 같은지 비교
		System.out.println("result2: " + result2);

	}

}
