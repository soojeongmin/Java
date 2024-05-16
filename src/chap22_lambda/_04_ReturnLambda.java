package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.basiclambda.ConcatString;

public class _04_ReturnLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String result = conc((str1, str2)-> str1+str2);
		//System.out.println(result);
		
		String result = conc((str1, str2)-> (str1+str2));
		System.out.println(result);
		
		result = conc((s1, s2)->{return s1+s2;});
	}

	public static String conc(ConcatString concatString) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요");
		String str1 = sc.nextLine();
		System.out.println("문자열을 입력하세요");
		String str2 = sc.nextLine();
		
		sc.close();
		return concatString.concat(str1,  str2);
	}
}
