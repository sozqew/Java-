package sec01;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010101-2130123";
		char gender = ssn.charAt(7);	//인덱스 번호가 7번인 것의 문자 1개 가져오기
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
	}
}
