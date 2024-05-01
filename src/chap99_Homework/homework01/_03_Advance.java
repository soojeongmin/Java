package chap99_Homework.homework01;

import java.util.Scanner;

public class _03_Advance {

	public static void main(String[] args) {
		/*
		// Advance 1
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int fiftyThousand = 0, tenThousand = 0, fiveThousand = 0, oneThousand = 0;
		int fiveHundred = 0, oneHundred = 0, fifty = 0, ten = 0;
		sc.close();

		if (money >= 50000) {
			fiftyThousand = money / 50000;
			tenThousand = (money % 50000) / 10000;
			fiveThousand = (money % 10000) / 5000;
			oneThousand = (money % 5000) / 1000;
			fiveHundred = (money % 1000) / 500;
			oneHundred = (money % 500) / 100;
			fifty = (money % 100) / 50;
			ten = (money % 50) / 10;
		} else if (money >= 10000) {
			tenThousand = (money % 50000) / 10000;
			fiveThousand = (money % 10000) / 5000;
			oneThousand = (money % 5000) / 1000;
			fiveHundred = (money % 1000) / 500;
			oneHundred = (money % 500) / 100;
			fifty = (money % 100) / 50;
			ten = (money % 50) / 10;
		} else if (money >= 5000) {
			fiveThousand = (money % 10000) / 5000;
			oneThousand = (money % 5000) / 1000;
			fiveHundred = (money % 1000) / 500;
			oneHundred = (money % 500) / 100;
			fifty = (money % 100) / 50;
			ten = (money % 50) / 10;
		} else if (money >= 1000) {
			oneThousand = (money % 5000) / 1000;
			fiveHundred = (money % 1000) / 500;
			oneHundred = (money % 500) / 100;
			fifty = (money % 100) / 50;
			ten = (money % 50) / 10;
		} else if (money >= 500) {
			fiveHundred = (money % 1000) / 500;
			oneHundred = (money % 500) / 100;
			fifty = (money % 100) / 50;
			ten = (money % 50) / 10;
		} else if (money >= 100) {
			oneHundred = (money % 500) / 100;
			fifty = (money % 100) / 50;
			ten = (money % 50) / 10;
		} else if (money >= 50) {
			fifty = (money % 100) / 50;
			ten = (money % 50) / 10;
		} else if (money >= 10)
			ten = (money % 50) / 10;
		else
			System.out.println("최소 금액을 넣어주세요.");
		System.out.println("<오만원 " + fiftyThousand + "매, 만원 " + tenThousand + "매, 오천원 " + fiveThousand + "매, 천원 "
				+ oneThousand + "매, 500원 " + fiveHundred + "개, 100원 " + oneHundred + "개, 50원 " + fifty + "개, 10원 " + ten
				+ "개>");
		
		
		// Advance 2
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요: ");
		int num = sc.nextInt();
		int ten, one, clap = 0;
		ten = num / 10;
		one = num % 10;

		if (ten == 9 || ten == 6 || ten == 3)
			clap++;
		if (one == 9 || one == 6 || one == 3)
			clap++;
		if (clap == 2)
			System.out.println("박수짝짝");
		else if (clap == 1)
			System.out.println("박수짝");

		sc.close();

		// Advance 3
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++)
				System.out.print(" ");
			for (int j = 0; j < i + i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
		
		*/
	}

}
