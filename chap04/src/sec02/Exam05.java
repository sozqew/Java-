package sec02;

public class Exam05 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for ( int j = 0; j <= i; j++) {
				System.out.print("*");
				if (i==j) {
					System.out.print("\n");
				}
			}
		}

	}

}
