package sec02;

public class Anonymous {
	Person person1 = new Person();	// 일반 객체
	Person person2 = new Person() {	// 익명 객체
		void work() {
			
		}
		
		@Override
		void wake() {
			
		}
	};
}
