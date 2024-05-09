package chap99_Homework.homework08;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _03_Advance {

	public static void main(String[] args) {
		// Advance 01
		int year = 2001, month = 12, date = 19;
		for(int i=2001;i<=2022;i++) if(isLeapYear(i)) date++;
		System.out.println(year+"년 "+month+"월 "+date+"일");

		
		Scanner sc = new Scanner(System.in);

		// Advace 02
		/*
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		calendar1.set(Integer.parseInt(str1.substring(0,4)), (Integer.parseInt(str1.substring(5,7))-1), Integer.parseInt(str1.substring(8,10)));
		calendar2.set(Integer.parseInt(str2.substring(0,4)), (Integer.parseInt(str2.substring(5,7))-1), Integer.parseInt(str2.substring(8,10)));
		
		long diff = calendar2.getTimeInMillis() - calendar1.getTimeInMillis();
		diff %= ((long)1000 * 60 * 60 * 24 * 365);
		long diffDate = diff / ((long)1000 * 60 * 60 * 24);
		*/
		
		// Advance 03
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<5;i++) list.add(sc.nextInt());
		Collections.sort(list);
		System.out.println(list.get(3)+", "+list.get(4));
		
		
		List<Integer> list1 = new ArrayList<>();
		for(int i=0;i<6;i++) list.add(sc.nextInt());
		Collections.sort(list);
		
		
		sc.close();
	}
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}
