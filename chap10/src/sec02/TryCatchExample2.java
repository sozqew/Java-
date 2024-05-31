package sec02;

public class TryCatchExample2 {
	public static void main(String[] args) {
		try {
			System.out.println("잘 나오나");
			return;
		} catch(Exception e) {
			System.out.println("Exception 발생");
		} finally {
			System.out.println("finally 실행됨");
		}
		
		System.out.println("프로그램 종료");

	}

}
