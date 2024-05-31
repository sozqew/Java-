package sec02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	// 클래스 자동 형 변환
		parent.method1();
		parent.method2();	// parent 의 method2가 아니라 child 의 method2
		//parent.method3();	// error

	}

}
