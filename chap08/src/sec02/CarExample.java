package sec02;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();	//한국 타이어가 굴러간다 x4
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();	//한국 타이어가 굴러간다 x2 금호 타이어가 굴러간다 x2
	}
}
