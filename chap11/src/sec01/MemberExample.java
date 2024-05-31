package sec01;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("blue");
		
		//재정의한 equals 함수로 obj1 obj2 같음("blue" == "blue")
		if(obj1.equals(obj2)) {
			System.out.println("obj1 obj2 동등");
		} else {
			System.out.println("obj1 obj2 동동하지 않음");
		}
		
		// 두 객체가 같다라는 의미는 -> == -> hashCode의 리턴숫자값이 같고 equals 메소드에서 리턴값이 true인 경우
		
		//재정의한 equals 함수로 obj1 obj3 다름("blue" != "red")
		if(obj1.equals(obj3)) {
			System.out.println("obj1 obj3 동등");
		} else {
			System.out.println("obj1 obj3 동등하지 않음");
		}
	}
}
