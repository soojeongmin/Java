package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.reference.Convertcase;

public class _09_ReferenceMethodEx01 {

	public static void main(String[] args) {
		// 1. 매개변수의 타입 추론이 끝난 경우에는 static 메소드가 아니어도
		// static 메소드를 참조하는 것처럼 메소드를 참조할 수 있다. 
		printConvertCase(s->s.toLowerCase());
		printConvertCase(String::toLowerCase);
	}
	
	public static void printConvertCase(Convertcase convertcase) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 단어를 입력하세요: ");
		String str = sc.nextLine();
		System.out.println(convertcase.toConvertcase(str));
		
	}

}
