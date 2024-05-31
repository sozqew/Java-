package sec02;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(bus);	 // 자동형변환이 되어 인수 전달
		driver.driver(taxi); // 자동형변환이 되어 인수 전달
	}
}
