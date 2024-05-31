package sec01;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i <= 999999999L; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		//System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("1~9999999999999999까지의 합: " + sum);
		System.out.println("계산에 " + (time2 - time1) + "나노초가 소요되었다.");
		System.out.println("계산에 " + ((time2 - time1) / (double)100000000) + " 초가 소요되었다.");
	}
}
