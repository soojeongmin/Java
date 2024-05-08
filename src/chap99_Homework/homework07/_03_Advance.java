package chap99_Homework.homework07;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Advance {

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
		String str2 = new String();
		for(char c : resultList) {
			str2 += c;
		}
		StringBuilder sb1 = new StringBuilder(str2);
		System.out.println(str2);
		
		sc.close();
	}

}
