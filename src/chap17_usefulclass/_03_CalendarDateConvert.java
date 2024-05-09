package chap17_usefulclass;

import java.util.Calendar;
import java.util.Date;

public class _03_CalendarDateConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 6, 7);
		
		// 1. Calendar객체를 Date객체로 반환
		// Date 생성자에 매개변수로 Calendar 객체의 getTimeInMillis() 메소드 전달
		Date date = new Date(cal.getTimeInMillis());
		
		// 2. Date객체를 Calendar 객체로 변환
		Calendar cal2 = Calendar.getInstance();
		
		// Calendar 객체의 setTime메소드의 매개변수로 Date객체 전달
		cal2.setTime(date);
		
		// 3. Date객체는 toString이 오버라이드되어있다.
		System.out.println(date);
		System.out.println(cal2);
		
		
	}

}
