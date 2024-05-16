package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.basiclambda.BasicCalculator;

public class _07_LambdaEx03 {

	public static void main(String[] args) {
		int result = calc((a, b, str) -> {
			if (str.charAt(0) == '+') {
				return a + b;
			} else if (str.charAt(0) == '-') {
				return a - b;
			} else if (str.charAt(0) == '*') {
				return a * b;
			} else if (str.charAt(0) == '/') {
				return a / b;
			} else if (str.charAt(0) == '%') {
				return a % b;
			} else {
				return a;
			}
		});
		System.out.println(result);
	}

	public static int calc(BasicCalculator basicCalculator) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		sc.close();
		return basicCalculator.calculate(num1, num2, str);
	}

}
