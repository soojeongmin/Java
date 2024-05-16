package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.basiclambda.ConvertcaseString;

public class _06_LambdaEx02 {

	public static void main(String[] args) {
		printConvertCase(str1 -> str1.toLowerCase());
		printConvertCase(str2->str2.toUpperCase());
	}
	
	public static void printConvertCase(ConvertcaseString convertcaseString) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 단어를 입력하세요: ");
		String str = sc.nextLine();
		String convertStr = convertcaseString.toConvertcase(str);
		System.out.println(convertStr);
	}

}
