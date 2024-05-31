package practice01;

public class Child02 extends Parent02 {
	private String name;
	
	public Child02() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child02(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
