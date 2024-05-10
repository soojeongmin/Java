package chap99_Homework.homework09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _01_Basic {

	public static void main(String[] args) {
		// Basic 01
		Map<String, Integer> alpha = new HashMap<>();
		for(int i=65;i<65+26;i++) {
			alpha.put(String.valueOf((char)i), i);
		}
		for(int i=97;i<97+26;i++) {
			alpha.put(String.valueOf((char)i), i);
		}
		System.out.println(alpha.entrySet());
		
		// Basic 02
		Map<String, Integer> info = new HashMap<>();
		info.put("홍길동", 1011111111);
		info.put("민수정", 1022222222);
		info.put("장길산", 1033333333);
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Set<Entry<String, Integer>> entrySet = info.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		
		 while(iterator.hasNext()){
			 Entry<String, Integer> entry = iterator.next();
			 if(entry.getKey().equals(str)) System.out.println(entry.getValue());
		 }
		sc.close();
	}

}
