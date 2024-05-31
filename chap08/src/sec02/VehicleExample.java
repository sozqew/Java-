package sec02;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();	//버스가 달린다.
		//vehicle.checkFare();	// error -> Vehicle 인터페이스에는 checkFare 메소드가 없음
		
		Bus bus = (Bus)vehicle;	// 강제형변환(casting)
		bus.run();
		bus.checkFare();		// bus 의 객체인 checkFare 메소드가 존재하므로 실행 가능
	}
}
