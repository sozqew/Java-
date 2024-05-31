package exam01;

import sec01.A;

public class D extends A {
	public D() {
		super(); // A의 기본 생성자를 호출
		this.field = "value";	//A의 field 멤버변수
		this.method();	//A의 메소드
	}
}
