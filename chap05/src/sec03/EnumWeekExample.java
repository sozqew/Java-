package sec03;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week week1 = Week.SATURDAY;
		Week week2 = Week.SATURDAY;
		System.out.println(week1 == week2);	// true
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);	// final int 변수
		System.out.println("현재연도: " + year);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		int month = now.get(Calendar.MONTH) + 1;
		System.out.println("현재월: " + month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재일: " + day);
		int _week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("현재요일: " + _week);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		//----------------------------------------------------
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDAY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4:
				today = Week.WEDNESDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;
			case 7:
				today = Week.SATURDAY; break;
		}
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}
}
