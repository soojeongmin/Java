package chap23_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _05_UsefulMethod {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			intList.add(i);
		}

		// 1. forEach: Stream 요소에 하나씩 접근하여 작성한 코드를 실행
		// Stream에 담겨있는 요소의 개수만큼 코드가 실행된다.
		// 최종단계 메소드이고 리턴 값이 없다
		intList.stream().forEach(num -> System.out.println(num));
		System.out.println("---------------");

		intList.stream().forEach(num -> {
			if (num % 2 == 0)
				System.out.println(num);
		});

		// 2. filter: Stream의 요소 중 특정 조건에 만족하는 요소들만 모아서 새로운 Stream을 리턴
		// 중간단계메소드, 람다식을 구성할 때 구현부에 true나 false가 리턴되도록 비교식이나 조건식을 사용한다.
		intList.stream().filter(num -> num > 5).forEach(num -> System.out.println(num));
		System.out.println("---------------");

		// int배열 두 개 선언해서
		// 첫 번째 배열에서 두 번째 배열에 있는 값 제거한 후 출력
		int[] arr1 = { 1, 5, 6, 9, 8, 10 };
		int[] arr2 = { 5, 8, 8, 7, 9, 10, 10 };
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(Arrays.stream(arr2).boxed().toArray(Integer[]::new)));
		Arrays.stream(arr1).filter(num->!set.contains(num)).forEach(num->System.out.println(num));
		
		System.out.println("---------------");
		// map: 실행 코드의 결과값들을 모아서 stream을 리턴
		// 새로운 stream에 담길 요소들을 리턴해줘야하기때문에 리턴구문이 필수적이다
		intList.stream().map(num->num*num).forEach(num->System.out.println(num));
		
		System.out.println("---------------");
		// intList에 담긴 값 중 짝수는 제곱으로 변경하고 홀수는 값 그대로 리턴해서 새로운 스트림을 만들고
		// foreach로 출력
		intList.stream().map(num->{if(num%2==0)return num*=num;else return num;}).forEach(num->System.out.println(num));

		System.out.println("---------------");
		// 4. reduce: 하나의 결과값(누적)을 도출하기 위해 사용
		// 최종단계 메소드
		// reduce(누적값의 초기값, (누적값이 될 변수, 요소에 하나씩 접근할 변수, 요소의 인덱스)-> 누적
		int sum = intList.stream().reduce(0, (acc, num)->acc+num).intValue();
		System.out.println(sum);
		

		System.out.println("---------------");
		// intList 요소들을 모두 곱한 값을 구하세요.
		// stream, reduce 메소드 사용
		int mul = intList.stream().reduce(1, (n1, n2)->n1*n2).intValue();
		System.out.println(mul);
		System.out.println("---------------");

		// num->{if(num%2==0)return num/2; else return num/3;}
		// intList에서 짝수는 /2 홀수는 /3 한 값들을 모두 더한 값을 구하세요. (map, reduce)
		int add = intList.stream().map(num->{if(num%2==0) return num/2; else return num/3;}).reduce(0, (num1, num2)->num1+num2).intValue();
		System.out.println(add);
	}
}
