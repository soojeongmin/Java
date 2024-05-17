package chap23_stream;

import java.util.ArrayList;
import java.util.List;

public class _15_MathMethod {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			intList.add(i);
		}

		// 1. allMatch(람다식): 람다식의 조건식의 모든 요소가 true여야 true리턴
		// 하나라도 false면 false리턴
		boolean result = intList.stream().allMatch(num -> num >= 0);
		System.out.println(result);

		// anyMatch(람다식): 람다식의 조건식에 하나라도 부합하면 true, 모든요소가 틀릴때만 false
		result = intList.stream().anyMatch(num->num==-1);
		System.out.println(result);
		
		// nonMatch(람다식): 람다식의 조건식에 모든 요소가 부합하지 않아야 true 리턴
//						   하나라도 부합하는 요소가 존재하면 false 리턴
		result = intList.stream().noneMatch(num->num>10);
		System.out.println(result);
	}

}
