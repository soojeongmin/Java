package chap99_Homework.homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _01_Basic {

	public static void main(String[] args) {
		// 01
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			intList.add((int) (Math.random() * 10) + 1);
		}

		Stream<Integer> integerStream = intList.stream().map(num -> num * 3);
		integerStream.forEach(num -> System.out.println(num));

		// 02
//		Scanner sc = new Scanner(System.in);
//		List<String> strList = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			System.out.print("문자열: ");
//			strList.add(sc.nextLine());
//		}
//		strList.stream().filter(str -> str.length() >= 5).forEach(str -> System.out.println(str));
//		sc.close();
		
		// 03
//		Scanner sc = new Scanner(System.in);
//		List<String> strList = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			System.out.print("문자열: ");
//			strList.add(sc.nextLine());
//		}
//		strList.stream().filter(str -> str.matches("^[a-zA-Z]*$")).forEach(str -> System.out.println(str));
//		sc.close();
	}

}
