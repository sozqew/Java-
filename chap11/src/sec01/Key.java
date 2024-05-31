package sec01;

public class Key {
	//필드
	public int number;
		
	//생성자
	public Key(int number) {
		// super(); //생략되어 있음(Object의 기본생성자)
		this.number = number;
	}
		
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {	// ClassCastException 방지
			Key compareKey = (Key) obj;	//강제형변환(casting)
				
			if(this.number == compareKey.number); 
				return true;
		}
		return false;
	}
	
	// 두 객체가 같다라는 의미는 -> == -> hashCode의 리턴숫자값이 같고 equals 메소드에서 리턴값이 true인 경우
	@Override
	public int hashCode() {	// 주소값이 hashCode 값이 아니라 number가 해시코드 되도록 재정의
		return number;
	}
}
