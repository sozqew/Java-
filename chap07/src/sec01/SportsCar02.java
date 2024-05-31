package sec01;

public class SportsCar02 extends Car02 {
	@Override
	public void speedUp() { speed += 10; }
	
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
