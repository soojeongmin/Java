package chap18_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import chap14_objectarray.car.Car;

public class _10_HashMapEx {

	public static void main(String[] args) {
		// Advance 04
		Scanner sc = new Scanner(System.in);
		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList.add(sc.nextInt());
		}

		List<Integer> sumList = new ArrayList<>();
		Map<String, Integer> intMap = new HashMap<>();

		for (int i = 0; i < intList.size(); i++) {
			for (int j = i + 1; j < intList.size(); j++) {
				if (j != i) {
					sumList.add(intList.get(i) + intList.get(j));
				}
			}
		}
		System.out.println(sumList);
		

		for(int i=0;i<sumList.size();i++) {
			int sumCnt = 1;
			for(int j=0;j<sumList.size();j++) {
				if (i != j) {
					if (sumList.get(i) == sumList.get(j)) sumCnt++;
				}
				
			}
			intMap.put(sumList.get(i).toString(), sumCnt);
		}
		System.out.println(intMap.entrySet());

		System.out.print("합이 유일한 합의 값: ");
		int count = 0;
		for(Map.Entry<String, Integer> i : intMap.entrySet()) {
			if(i.getValue()==1) {
				count++;
				System.out.print(i.getKey()+", ");
			}
		}
		System.out.println("유일한 합의 개수: "+count);
		sc.close();
		/*
		 * Set<Entry<String, Integer>> entrySet = intMap.entrySet();
		 * Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		 * 
		 * int cnt = 0;
		 * 
		 * while(iterator.hasNext()){
		 * 		Entry<String, Integer> entry = iterator.next();
		 * 
		 * 		if(entry.getValue()==1){
		 * 			syso(entry.getKey()+", ");
		 * 			cnt++;
		 * 		}
		 * }
		 */

	}

}
