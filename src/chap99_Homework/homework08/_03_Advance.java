package chap99_Homework.homework08;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class _03_Advance {

	public static void main(String[] args) {
		// Advance 01
		Scanner sc = new Scanner(System.in);
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2001, 11, 19);

		for (int i = 2001; i <= 2022; i++) {
			if (isLeapYear(i)) {
				cal1.add(Calendar.DATE, 1);
			}
		}

		SimpleDateFormat sdf1 = new SimpleDateFormat("MM월 dd일");

		Date d1 = new Date(cal1.getTimeInMillis());

		System.out.println("2022년 결혼기념일 날짜는 " + sdf1.format(d1) + "입니다.");
		System.out.println("------------------------------");

		// Advace 02
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

		System.out.print("첫 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate1 = sc.nextLine();
		System.out.print("두 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate2 = sc.nextLine();

		String[] dateArr1 = inputDate1.split("-");
		String[] dateArr2 = inputDate2.split("-");

		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();

		cal2.set(Integer.parseInt(dateArr1[0]), (Integer.parseInt(dateArr1[1]) - 1), Integer.parseInt(dateArr1[2]));
		cal3.set(Integer.parseInt(dateArr2[0]), (Integer.parseInt(dateArr2[1]) - 1), Integer.parseInt(dateArr2[2]));

		Date d2 = new Date(cal2.getTimeInMillis());
		Date d3 = new Date(cal3.getTimeInMillis());

		int compare = d2.compareTo(d3);

		if (compare > 0) {
			long diff = cal2.getTimeInMillis() - cal3.getTimeInMillis();

			long day = diff / (1000 * 60 * 60 * 24);

			System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));

			for (long i = 1; i < day; i++) {
				cal3.add(Calendar.DATE, 1);
				System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
			}

			System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
		} else if (compare < 0) {
			long diff = cal3.getTimeInMillis() - cal2.getTimeInMillis();

			long day = diff / (1000 * 60 * 60 * 24);

			System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));

			for (long i = 0; i < day; i++) {
				cal2.add(Calendar.DATE, 1);
				System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
			}

			System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
		} else {
			System.out.println("두 날짜는 같습니다.");
		}

		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");

		System.out.print("첫 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate3 = sc.nextLine();
		System.out.print("두 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate4 = sc.nextLine();

		String[] dateArr3 = inputDate3.split("-");
		String[] dateArr4 = inputDate4.split("-");

		Calendar cal4 = Calendar.getInstance();
		Calendar cal5 = Calendar.getInstance();

		cal4.set(Integer.parseInt(dateArr3[0]), (Integer.parseInt(dateArr3[1]) - 1), Integer.parseInt(dateArr3[2]));
		cal5.set(Integer.parseInt(dateArr4[0]), (Integer.parseInt(dateArr4[1]) - 1), Integer.parseInt(dateArr4[2]));

		long diff = 0;

		Date first;
		Date last;

		if (cal4.getTimeInMillis() > cal5.getTimeInMillis()) {
			diff = cal4.getTimeInMillis() - cal5.getTimeInMillis();
			first = new Date(cal5.getTimeInMillis());
			last = new Date(cal4.getTimeInMillis());
		} else {
			diff = cal5.getTimeInMillis() - cal4.getTimeInMillis();
			first = new Date(cal4.getTimeInMillis());
			last = new Date(cal5.getTimeInMillis());
		}

		if (diff != 0) {
			long day = diff / (1000 * 60 * 60 * 24);
			System.out.println(day);

			System.out.println(sdf3.format(first));
			cal5.setTime(first);

			for (long i = 1; i < day; i++) {
				cal5.add(Calendar.DATE, 1);
				System.out.println(sdf3.format(new Date(cal5.getTimeInMillis())));
			}

			System.out.println(sdf3.format(last));
		} else {
			System.out.println("둘 날짜는 같습니다.");
		}

		// Advance 03
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++)
			list.add(sc.nextInt());
		Collections.sort(list);
		System.out.println(list.get(3) + ", " + list.get(4));

		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < 6; i++)
			list.add(sc.nextInt());
		Collections.sort(list);

		// Advance 04
		List<Integer> intList2 = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList2.add(sc.nextInt());
		}

		List<Integer> sumList = new ArrayList<>();

		List<Integer> cntList = new ArrayList<>();

		List<Integer> valueList = new ArrayList<>();

		for (int i = 0; i < intList2.size(); i++) {
			for (int j = i + 1; j < intList2.size(); j++) {
				if (j != i) {
					sumList.add(intList2.get(i) + intList2.get(j));
				}
			}
		}

		System.out.println(sumList);
		for (int i = 0; i < sumList.size(); i++) {
			int sumCnt = 1;

			for (int j = 0; j < sumList.size(); j++) {
				if (i != j) {
					if (sumList.get(i) == sumList.get(j)) {
						// System.out.println(sumList.get(i));
						sumCnt++;
					}
				}
			}

			if (sumCnt > 0) {
				cntList.add(sumCnt);
				valueList.add(sumList.get(i));
			}
		}

		System.out.println(cntList);
		System.out.println(valueList);

		int sumCnt = 0;

		System.out.print("합이 유일한 합의 값: ");
		for (int i = 0; i < sumList.size(); i++) {
			if (cntList.get(i) == 1) {
				sumCnt++;
				System.out.print(valueList.get(i) + ", ");
			}
		}

		System.out.println("유일한 합의 개수: " + sumCnt);

		sc.close();
	}

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}
