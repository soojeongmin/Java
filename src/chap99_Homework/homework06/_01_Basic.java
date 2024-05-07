package chap99_Homework.homework06;

import java.util.Scanner;

public class _01_Basic {

	public static void main(String[] args) {
		// basic 1
		Scanner sc = new Scanner(System.in);
		String userStr = sc.nextLine();
		int gcount = 0, bcount = 0;
		char[] charArr = userStr.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == '가')
				gcount++;
			else if (charArr[i] == '바')
				bcount++;
		}
		if (gcount == 0 && bcount == 0)
			System.out.println("가, 바가 존재하지 않습니다.");
		else {
			System.out.println("가: " + gcount + ", 바: " + bcount);
		}

		// basic 2
		String astr = sc.nextLine();
		char[] cArr = astr.toCharArray();
		char[] rArr = new char[cArr.length];
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] == 'a' || cArr[i] == 'e' || cArr[i] == 'i' || cArr[i] == 'o' || cArr[i] == 'u' || cArr[i] == 'A'
					|| cArr[i] == 'E' || cArr[i] == 'I' || cArr[i] == 'O' || cArr[i] == 'U') {
				continue;
			} else {
				rArr[i] = cArr[i];
			}
		}
		for (int i = 0; i < cArr.length; i++) {
			System.out.print(rArr[i]);
		}
		System.out.println();

		// basic 3
		double a = 16.459;
		System.out.println(Math.round(a * 100) / 100.0);

		// middle 1
		String str = sc.nextLine();
		char[] chArr = str.toCharArray();
		if (chArr.length % 2 == 0)
			System.out.println(chArr[(chArr.length / 2) - 1] + "" + chArr[(chArr.length / 2)]);
		else
			System.out.println(chArr[chArr.length / 2]);
		sc.close();

		// middle 2
		char[] alpha = { 'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't' };
		String bit = "" + alpha[0] + alpha[4] + alpha[8];
		String com = "" + alpha[1] + alpha[5] + alpha[9];
		String sql = "" + alpha[2] + alpha[6] + alpha[10];
		String iint = "" + alpha[3] + alpha[7] + alpha[11];
		System.out.println(bit + " " + com + " " + sql + " " + iint);
		
		// middle 3
		int money = 10000;
		int rate = 10;
		int years = 10;
		
		double result = Math.pow(1+(rate/100), years) * money;
		System.out.println(result);
		
		
		for (int i = 0; i < years; i++) {
            money += money * rate;
        }
		System.out.println(money);

	}

}
