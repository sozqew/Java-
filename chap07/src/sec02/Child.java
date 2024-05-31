package sec02;

public class Child extends Parent{
	void method3() {
		System.out.println("Child-method3()");
	}
	
	@Override
	void method2() {
		System.out.println("Child-method2()");
	}
}
