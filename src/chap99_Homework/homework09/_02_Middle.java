package chap99_Homework.homework09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _02_Middle {
	public static void main(String[] args) {
		// Middle 01
		Map<String, Integer> student = new HashMap<>();
		student.put("김상희", 80);
		student.put("민수정", 70);
		student.put("민경선", 100);
		student.put("민성원", 50);

		Set<Entry<String, Integer>> entrySet = student.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();

		int max = 0;
		String name = "";

		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			if (entry.getValue() > max) {
				name = entry.getKey();
				max = entry.getValue();
			}
		}

		System.out.println(name + " : " + max);

		// Middle 02
		Map<Integer, Integer> mul = new HashMap<>();
		mul.put(1, 2);
		mul.put(2, 4);
		mul.put(3, 5);
		Entry<Integer, Integer> entry = getMaxMul(mul);

		// Middle 03
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 3);
		map.put(2, 4);
		map.put(3, 5);
		printKVDesc(map);
	}

	public static Entry<Integer, Integer> getMaxMul(Map<Integer, Integer> map) {
		List<Integer> keyList = new ArrayList<>(map.keySet());
		int max = 0, cnt = 0;
		for(Integer i : keyList) {
			if(max<i*map.get(i)) {
				max = i*map.get(i);
				cnt = i;
			}
		}
		System.out.println(cnt*map.get(cnt));
		Entry<Integer, Integer> entry = Map.entry(cnt, map.get(cnt));
		return entry;
	}

	public static void printKVDesc(Map<Integer, Integer> map) {
		List<Integer> keyList = new ArrayList<>(map.keySet());
		for(Integer i : keyList) {
			System.out.println(i + " : " + map.get(keyList.size()-i+1));
		}
	}
}
