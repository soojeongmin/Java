package chap99_Homework.homework08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _02_Middle {

	public static void main(String[] args) {
		// Middle 1
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Integer.parseInt(str.substring(0,4)), (Integer.parseInt(str.substring(5,7))-1), Integer.parseInt(str.substring(8,10)));
		calendar.add(Calendar.DATE, 3);
		Date date = new Date(calendar.getTimeInMillis());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(date));
		
		
		// Middle 2
		String str1 = sc.nextLine();
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(Integer.parseInt(str1.substring(0,4)), Integer.parseInt(str1.substring(5,7))-1, Integer.parseInt(str1.substring(8,10)));
		String[] dayArr = { "", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		System.out.println(dayArr[calendar1.get(Calendar.DAY_OF_WEEK)]);
		sc.close();
				
		// Middle 3
		Calendar calendar2 = Calendar.getInstance();
		Calendar calendar3 = Calendar.getInstance();
		calendar2.set(2023, 3, 15, 20, 31, 45);
		calendar3.set(2021, 7, 8, 11, 58, 04);
		long diff = calendar2.getTimeInMillis() - calendar3.getTimeInMillis();
		long diffTime = diff / ((long)1000 * 60 * 60);
		diff %= ((long)1000 * 60 * 60);
		long diffMin = diff / ((long)1000 * 60);
		diff %= ((long)1000 * 60);
		long diffSec = diff / ((long)1000);
		System.out.println(diffTime+"시 "+diffMin+"분 "+diffSec+"초");
		
	}

}
