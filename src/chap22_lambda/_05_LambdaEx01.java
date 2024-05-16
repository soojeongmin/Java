package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.basiclambda.IndexOfString;

public class _05_LambdaEx01 {

	public static void main(String[] args) {
		findIndex((str1, str2)-> str1.indexOf(str2));
	}

	// 문자열 2개를 입력받아서 
	// 첫 번째 입력받은 문자열에서
	// 두 번째 입력받은 문자열이 어느 위치(인덱스)에 있는지 검사하는 메소드를 구현하세요
	// 매개변수는 함수형 인터페이스인 IndexOfString을 받습니다.
	// 검사해서 첫 번째 문자열에 두 번째 문자열이 포함되어있으면
	// 문자열1에서 문자열2의 인덱스는 8입니다.
	
	public static void findIndex(IndexOfString indexOfString) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String s1 = sc.nextLine();
		System.out.print("문자열: ");
		String s2 = sc.nextLine();
		sc.close();
		int index = indexOfString.indexOf(s1, s2);
		if(index!=-1)
			System.out.println(s1+"에서 "+s2+"의 인덱스는 "+index+"입니다.");
		else
			System.out.println(s1+"에서 "+s2+"를 찾을 수 없습니다.");
		
		
	}
}
