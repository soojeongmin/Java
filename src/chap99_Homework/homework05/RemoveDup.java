package chap99_Homework.homework05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] cArr = str.toCharArray();
		ArrayList<Character> arrayList = new ArrayList<>();
		for(char c : cArr) arrayList.add(c);
		
		ArrayList<Character> resultList = new ArrayList<Character>();
		for(Character c:arrayList) {
			if(!resultList.contains(c)) resultList.add(c);
		}
		
		for(char c : resultList) System.out.print(c);
		
		/*
		String str = sc.nextLine();
		char[] cArr = str.toCharArray();

		for(int i=1;i<=cArr.length;i++) {
			if(i%3==0) cArr[i-1] = '3';
			if(i%5==0) cArr[i-1] = '5';
		}
		
		for(int i=0;i<cArr.length;i++) System.out.print(cArr[i]);
		*/
	}

}
