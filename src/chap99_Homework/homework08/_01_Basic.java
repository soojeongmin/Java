package chap99_Homework.homework08;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class _01_Basic {

	public static void main(String[] args) {
		// basic 1
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 5);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DATE, 3);
		System.out.println(calendar.get(Calendar.YEAR) + "-" + ((calendar.get(Calendar.MONTH) + 1) < 10 ? "0" + (calendar.get(Calendar.MONTH) + 1) : (calendar.get(Calendar.MONTH) + 1)) + "-" + (calendar.get(Calendar.DATE) < 10 ? "0" + calendar.get(Calendar.DATE) : calendar.get(Calendar.DATE)));
		
		// basic 2
		Calendar calendar1 = Calendar.getInstance();
		System.out.println(calendar1.get(Calendar.YEAR) + "-" + ((calendar1.get(Calendar.MONTH) + 1) < 10 ? "0" + (calendar1.get(Calendar.MONTH) + 1) : (calendar1.get(Calendar.MONTH) + 1)) + "-" + (calendar1.get(Calendar.DATE) < 10 ? "0" + calendar1.get(Calendar.DATE) : calendar1.get(Calendar.DATE)));
		System.out.println(calendar.get(Calendar.YEAR)+"년 "+(calendar.get(Calendar.MONTH)+1)+"월 "+calendar.get(Calendar.DATE)+"일 "+(calendar.get(Calendar.AM_PM)==0? calendar.get(Calendar.HOUR): 12+calendar.get(Calendar.HOUR))+"시 "+calendar.get(Calendar.MINUTE)+"분 "+calendar.get(Calendar.SECOND)+"초");
	
		 // basic 3
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) list.add(sc.nextInt());
		System.out.println(list);
		sc.close();
	}

}
