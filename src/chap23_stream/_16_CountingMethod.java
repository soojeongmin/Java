package chap23_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _16_CountingMethod {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			intList.add(i);
		}

		long count = intList.stream().count();
		System.out.println(count);

		// findFirst(): Stream의 첫번째요소를 Optional객체에 담아서 리턴
		Integer first = intList.stream().filter(num -> num > 5).findFirst().orElseThrow();
		System.out.println(first);

		// max(Comparator.comparing( 람다식)): 람다식에서 지정된 값의 최대값을 구하는 메소드
		// min(이하동일 ) 최소값
		// Stream<제네릭> 타입일 때만 매개변수를 넣어준다.
		// 기본타입 스트림인 IntStream, LongStream, DoubleStream에서는 매개변수가 필요없다.
		Integer max = intList.stream().max(Comparator.comparing(num -> num)).orElseThrow();
		System.out.println(max);

		Integer min = intList.stream().min(Comparator.comparing(num -> num)).orElseThrow();
		System.out.println(min);

		int max1 = intList.stream().mapToInt(num -> num).max().getAsInt();
		System.out.println(max1);

		int min1 = intList.stream().mapToInt(num -> num).min().getAsInt();
		
	}
}
