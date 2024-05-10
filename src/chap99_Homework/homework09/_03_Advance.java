package chap99_Homework.homework09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class _03_Advance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<Character, Integer> cMap = new HashMap<>();
		String tmp = sc.nextLine();
		char[] chArr = tmp.toCharArray();
		for (int i = 0; i < chArr.length; i++)
			cMap.put(chArr[i], tmp.length() - tmp.replace(String.valueOf(chArr[i]), "").length());

		Set<Entry<Character, Integer>> entrySet = cMap.entrySet();
		Iterator<Entry<Character, Integer>> iterator = entrySet.iterator();
		int max = 0;
		char c = '-';
		while (iterator.hasNext()) {
			Entry<Character, Integer> entry = iterator.next();
			if (entry.getValue()>max) {
				max = entry.getValue();
				c = entry.getKey();
			}
		}
		
		System.out.println(c+" : "+max);
	}
}
