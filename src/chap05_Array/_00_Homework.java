package chap05_Array;

import java.util.Random;
import java.util.Scanner;

public class _00_Homework {

	public static void main(String[] args) {
		/*
		
		// Advance 1
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int fiftyThousand = 0, tenThousand = 0, fiveThousand = 0, oneThousand = 0;
		int fiveHundred = 0, oneHundred = 0, fifty = 0, ten = 0;
		
		if(money>=50000) {
			fiftyThousand = money/50000;
			tenThousand = (money%50000)/10000;
			fiveThousand = (money%10000)/5000;
			oneThousand = (money%5000)/1000;
			fiveHundred = (money%1000)/500;
			oneHundred = (money%500)/100;
			fifty = (money%100)/50;
			ten = (money%50)/10;
		}
		else if(money>=10000) {
			tenThousand = (money%50000)/10000;
			fiveThousand = (money%10000)/5000;
			oneThousand = (money%5000)/1000;
			fiveHundred = (money%1000)/500;
			oneHundred = (money%500)/100;
			fifty = (money%100)/50;
			ten = (money%50)/10;
		}
		else if(money>=5000) {
			fiveThousand = (money%10000)/5000;
			oneThousand = (money%5000)/1000;
			fiveHundred = (money%1000)/500;
			oneHundred = (money%500)/100;
			fifty = (money%100)/50;
			ten = (money%50)/10;
		}
		else if(money>=1000) {
			oneThousand = (money%5000)/1000;
			fiveHundred = (money%1000)/500;
			oneHundred = (money%500)/100;
			fifty = (money%100)/50;
			ten = (money%50)/10;
		}
		else if(money>=500) {
			fiveHundred = (money%1000)/500;
			oneHundred = (money%500)/100;
			fifty = (money%100)/50;
			ten = (money%50)/10;
		}
		else if(money>=100) {
			oneHundred = (money%500)/100;
			fifty = (money%100)/50;
			ten = (money%50)/10;
		}
		else if(money>=50) {
			fifty = (money%100)/50;
			ten = (money%50)/10;
		}
		else if(money>=10) ten = (money%50)/10;
		else System.out.println("최소 금액을 넣어주세요.");
		System.out.println("<오만원 "+fiftyThousand+"매, 만원 "+tenThousand+"매, 오천원 "+fiveThousand+
				"매, 천원 "+oneThousand+"매, 500원 "+fiveHundred+"개, 100원 "+oneHundred+"개, 10원 "+ten+"개>");
		
		
		// Advance 2
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요: ");
		int num = sc.nextInt();
		int ten, one, clap = 0;
		ten = num/10; one = num%10;

		if(ten==9 || ten==6 || ten==3) clap++;
		if(one==9 || one==6 || one==3) clap++;
		if(clap==2) System.out.println("박수짝짝");
		else if(clap==1) System.out.println("박수짝");
		
		sc.close();
		
		// Advance 3
		for(int i=1; i<=5; i++) {
		    for(int j=0; j<5-i; j++) System.out.print(" ");
		    for(int j=0; j<i+i-1; j++) System.out.print("*");
		    System.out.println ();
		}
		
		*/
		
		/*

		// Middle 1
		for(int i = 1; i <= 100; i++) {
			if(i%2==0 && i%3==0)  {
				System.out.print(i + ", ");
			}
		}
		
		// Middle 3
		int i = 1;
		while(i<=10) {
			if(i%2==0) System.out.println(i);
			i++;
		}
		
		// Middle 4
		int sum = 0;
		for(int i=0;i<1000;i++) {
			if(i%2==0&&i%7==0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("합: "+sum);
		
		// Middle 5
		int[] numArr = new int[20];
		Random random = new Random();
		for(int i=0;i<numArr.length;i++) numArr[i] = random.nextInt(101);
		System.out.println("<홀수번째>");
		for(int i=1;i<numArr.length;i+=2) 
			System.out.println(i+"번째: "+numArr[i]);
		System.out.println("<짝수번째>");
		for(int i=numArr.length-2;i>=0;i-=2) 
			System.out.println(i+"번째: "+numArr[i]);
		
		// Middle 6-1
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) System.out.print("*");
			System.out.println();
		}
				
		// Middle 6-2
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) System.out.print(" ");
			for(int j=0;j<=i;j++) System.out.print("*");
			System.out.println();
		}
		
		// Middle 6-3
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) System.out.print("*");
			System.out.println();
		}

		// Middle 6-4
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) System.out.print(" ");
			for(int j=0;j<5-i;j++) System.out.print("*");
			System.out.println();
		}

		*/
		
		/*
		
		// Basic 1
		int num = 10;
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num+=0;
		System.out.println(num);
		num-=2;
		System.out.println(num);
		num-=0;
		System.out.println(num);
		num-=2;
		System.out.println(num);
		
		// Basic 2
		int a = 10;
		int b = 20;
		System.out.println(10<20);
		System.out.println(10>20);
		
		// Basic 3
		int i = 10;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
		
		// Basic 4
		int i = 10;
		do {
			System.out.println(i);
			i--;
		} while(i>0);
				
		// Basic 5
		for(int i=10;i>0;i--) System.out.println(i);
		
		// Basic 6
		int i=1, sum = 0;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		// Basic 7
		int i=1, sum = 0;
		do {
			sum += i;
			i++;
		} while(i<=100);
		System.out.println(sum);
		
		// Basic 8
		int sum = 0;
		for(int i=1;i<=100;i++)sum += i;
		System.out.println(sum);
		
		// Basic 9
		int[] numArr = new int[10];
		for(int i=0;i<10;i++) numArr[i] = (i+1)*3;
		for(int i=numArr.length-1;i>=0;i--) System.out.println(numArr[i]);
		
		// Basic 10
		int[] numArr = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			numArr[i] = sc.nextInt();
			sum += numArr[i];
		}
		for(int i=0;i<10;i++) System.out.println(numArr[i]);
		System.out.println("sum: "+sum);
		sc.close();

		// Basic 11
		int[] numArr = new int[10];
		Random random = new Random();
		for(int i=0;i<10;i++) numArr[i] = random.nextInt(10) + 1;
		for(int i=0;i<10;i++) {
			if(numArr[i]%2!=0) System.out.println(numArr[i]);
		}
				
		// Basic 12
		int[] numArr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) numArr[i] = sc.nextInt();
		for(int i=0;i<10;i++) {
			if(numArr[i]%2==0 || numArr[i]%3==0) System.out.println(numArr[i]);
		}
		
		 */
	
	}

}
