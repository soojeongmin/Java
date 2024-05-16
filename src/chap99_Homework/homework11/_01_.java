package chap99_Homework.homework11;

import java.util.Arrays;
import java.util.Scanner;

public class _01_ {

	public static void main(String[] args) {

		/*
		 * // --------------------변수--------------------
		 * 
		 * // 01
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("이름: "); String name =
		 * sc.nextLine(); System.out.print("나이: "); int age = sc.nextInt();
		 * sc.nextLine(); System.out.print("성별: "); String sex = sc.nextLine();
		 * System.out.println("이름: " + name + ", 나이: " + age + ", 성별: " + sex);
		 * sc.close();
		 * 
		 * // 02
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int a =
		 * sc.nextInt(); System.out.print("값: "); int b = sc.nextInt();
		 * System.out.print("연산: "); char c = sc.next().charAt(0); switch (c) { case
		 * '+': System.out.println(a + " + " + b + " = " + (a + b)); break; case '-':
		 * System.out.println(a + " - " + b + " = " + (a - b)); break; case '*':
		 * System.out.println(a + " * " + b + " = " + (a * b)); break; case '/':
		 * System.out.println(a + " / " + b + " = " + (a / b)); break; case '%':
		 * System.out.println(a + " % " + b + " = " + (a % b)); break; } sc.close();
		 * 
		 * // 03
		 * 
		 * final double PI = 3.14; int radius = 20; System.out.println("넓이: " + 2 * PI *
		 * Math.pow(radius, 2) + ", 둘레: " + 4 * PI * radius);
		 * 
		 * // 04
		 * 
		 * Scanner sc = new Scanner(System.in); int sum = 0; for (int i = 0; i < 5; i++)
		 * { System.out.print("값: "); sum += sc.nextInt(); } System.out.println("합계: " +
		 * sum + ", 평균: " + sum / 5); sc.close();
		 * 
		 * // 05
		 * 
		 * Scanner sc = new Scanner(System.in); int[] arr = new int[3]; for (int i = 0;
		 * i < arr.length; i++) { System.out.print("값: "); arr[i] = sc.nextInt(); }
		 * Arrays.sort(arr); System.out.println("최소값: " + arr[0] + ", 중간값: " + arr[1] +
		 * ", 최대값: " + arr[2]); sc.close();
		 * 
		 * // 06
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int num =
		 * sc.nextInt(); for (int i = 1; i <= 9; i++) { System.out.println(num + " * " +
		 * i + " = " + num * i); } sc.close();
		 * 
		 * // 07
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int num =
		 * sc.nextInt(); int fac = 1; for (int i = 1; i <= num; i++) { fac *= i; }
		 * System.out.println(num + "! = " + fac); sc.close();
		 * 
		 * // 08
		 * 
		 * Scanner sc = new Scanner(System.in); int[] arr = new int[10]; int count = 0;
		 * for (int i = 0; i < arr.length; i++) { System.out.print("값: "); arr[i] =
		 * sc.nextInt(); } for (int i = 0; i < arr.length; i++) { if (isPrime(arr[i]))
		 * count++; } System.out.println("소수의 개수: " + count); sc.close();
		 * 
		 * // --------------------형 변환--------------------
		 * 
		 * // 01
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); String a =
		 * sc.nextLine(); System.out.print("값: "); String b = sc.nextLine();
		 * System.out.println(a + " + " + b + " = " + (Integer.parseInt(a) +
		 * Integer.parseInt(b))); sc.close();
		 * 
		 * // 02
		 * 
		 * Scanner sc = new Scanner(System.in); int a = sc.nextInt(); int b =
		 * sc.nextInt(); System.out.println(a + " / " + b + " = " + (double) a / b);
		 * sc.close();
		 * 
		 * // 03
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); double a =
		 * sc.nextDouble(); System.out.println(a + " > " + (int) a);
		 * 
		 * // 04
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); double a =
		 * sc.nextDouble(); System.out.println(a + "의 제곱: " +
		 * Double.toString(Math.pow(a, 2))); sc.close();
		 * 
		 * // 05
		 * 
		 * int iNum = 10; long lNum = 20; int tmp; tmp = iNum; iNum = (int) lNum; lNum =
		 * tmp; System.out.println("iNum: " + iNum + ", lNum: " + lNum);
		 * 
		 * // 06
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("알파벳: "); char a =
		 * sc.next().charAt(0); System.out.print("알파벳: "); char b = sc.next().charAt(0);
		 * System.out.println(a + ": " + (int) a + ", " + b + ": " + (int) b);
		 * sc.close();
		 * 
		 * // --------------------연산자--------------------
		 * 
		 * // 01
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int a =
		 * sc.nextInt(); System.out.print("값: "); int b = sc.nextInt();
		 * System.out.println(a + " + " + b + " = " + (a + b)); System.out.println(a +
		 * " - " + b + " = " + (a - b)); System.out.println(a + " * " + b + " = " + (a *
		 * b)); System.out.println(a + " / " + b + " = " + (a / b));
		 * System.out.println(a + " % " + b + " = " + (a % b)); sc.close();
		 * 
		 * // 02
		 * 
		 * int num = 20; System.out.print(++num + ", "); System.out.print(++num + ", ");
		 * System.out.print(num-- + ", "); System.out.print(num-- + ", ");
		 * System.out.print(num-- + ", "); System.out.print(++num + ", ");
		 * System.out.print(--num + ", "); System.out.print("마지막 변수의 값: " + (num + 1));
		 * 
		 * // 03
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int num =
		 * sc.nextInt(); if (num % 2 == 0 && num % 7 == 0)
		 * System.out.println("2와 7의 공배수"); else System.out.println("2와 7의 공배수가 아님");
		 * sc.close();
		 * 
		 * // 04
		 * 
		 * Scanner sc = new Scanner(System.in); String str = sc.nextLine(); if
		 * (str.equals("Hello")) System.out.println("동일한 문자열입니다."); else
		 * System.out.println("다른 문자열입니다."); sc.close();
		 * 
		 * // 05
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int num =
		 * sc.nextInt(); System.out.println((num % 2 != 0) ? "홀수" : "짝수"); sc.close();
		 * 
		 * // 06
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int num =
		 * sc.nextInt(); System.out.println((num >= 100) ? (num > 100) ? "100보다 큼" :
		 * "100" : "100보다 작음"); sc.close();
		 * 
		 * // 07
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); double a =
		 * sc.nextDouble(); System.out.print("값: "); double b = sc.nextDouble();
		 * System.out.println(a + " + " + b + " = " + (a + b)); System.out.println(a +
		 * " - " + b + " = " + (a - b)); System.out.println(a + " * " + b + " = " + (a *
		 * b)); System.out.println(a + " / " + b + " = " + (a / b));
		 * System.out.println(a + " % " + b + " = " + (a % b)); sc.close();
		 * 
		 * // 08
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("문자열: "); String str =
		 * sc.nextLine(); System.out.print("값: "); int num = sc.nextInt();
		 * System.out.println("입력한 문자열 " + str + "이고, 입력한 숫자는 " + num + "입니다.");
		 * sc.close();
		 * 
		 * // --------------------조건문--------------------
		 * 
		 * // 01
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int a =
		 * sc.nextInt(); System.out.print("값: "); int b = sc.nextInt();
		 * System.out.println((a > b) ? a : b); sc.close();
		 * 
		 * // 02
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int num =
		 * sc.nextInt(); System.out.println((num >= 0) ? "양수" : "음수"); sc.close();
		 * 
		 * // 03
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("문자열: "); String str =
		 * sc.nextLine(); switch (str) { case "Java": System.out.println("좋아하는 언어입니다.");
		 * break; case "Python": System.out.println("공부중인 언어입니다."); break; default:
		 * System.out.println("다른 언어를 공부해보세요."); break; } sc.close();
		 * 
		 * // 04
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int num =
		 * sc.nextInt(); switch (num % 3) { case 0: System.out.println("3의 배수입니다.");
		 * break; default: System.out.println("3의 배수가 아닙니다."); break; } sc.close();
		 * 
		 * // 05
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int num =
		 * sc.nextInt(); System.out.println((num % 2 != 0) ? "홀수입니다." : "짝수입니다.");
		 * sc.close();
		 * 
		 * // 06
		 * 
		 * Scanner sc = new Scanner(System.in); int[] arr = new int[5]; for (int i = 0;
		 * i < arr.length; i++) { System.out.print("값: "); int num = sc.nextInt(); }
		 * Arrays.sort(arr); System.out.println("가장 큰 수: " + arr[4]); sc.close();
		 * 
		 * // 07
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("문자열: "); String str =
		 * sc.nextLine(); if (str.equals("Yes")) System.out.println("예"); else if
		 * (str.equals("No")) System.out.println("아니오"); else
		 * System.out.println("잘못 입력하셨습니다."); sc.close();
		 * 
		 * // 08
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int a =
		 * sc.nextInt(); System.out.print("값: "); int b = sc.nextInt(); if (a == b)
		 * System.out.println("두 수가 같습니다."); else if (a > b)
		 * System.out.println("첫 번째 수가 더 큽니다."); else
		 * System.out.println("두 번째 수가 더 큽니다."); sc.close();
		 * 
		 * // 09
		 * 
		 * Scanner sc = new Scanner(System.in); int[] arr = new int[3]; int evenCount =
		 * 0; for (int i = 0; i < arr.length; i++) { System.out.print("값: "); arr[i] =
		 * sc.nextInt(); if (arr[i] % 2 == 0) evenCount++; } if (evenCount == 3)
		 * System.out.println("모두 짝수입니다."); else if (evenCount == 0)
		 * System.out.println("모두 홀수입니다."); else { System.out.println("짝수 : " +
		 * evenCount + "개, 홀수 : " + (3 - evenCount) + "개 입니다."); } sc.close();
		 * 
		 * // --------------------반복문--------------------
		 * 
		 * // 01
		 * 
		 * int sum = 0; for (int i = 1; i <= 10; i++) { sum += i; }
		 * System.out.println("1~10의 합: " + sum);
		 * 
		 * // 02
		 * 
		 * int num = 2; for (int i = 1; i <= 10; i++) { num *= 2; System.out.print("2");
		 * for (int j = 0; j < i; j++) { System.out.print(" * 2"); }
		 * System.out.println(" = " + num); }
		 * 
		 * // 03
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int num =
		 * sc.nextInt(); for (int i = 2; i <= num; i++) { if (isPrime(i))
		 * System.out.print(i + " "); } sc.close();
		 * 
		 * // 04
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("값: "); int num =
		 * sc.nextInt(); for (int i = 1; i <= num; i++) { if (num % i == 0)
		 * System.out.print(i + " "); } sc.close();
		 * 
		 * // 05
		 * 
		 * Scanner sc = new Scanner(System.in); int[] arr = new int[10]; for (int i = 0;
		 * i < arr.length; i++) { System.out.print("값: "); arr[i] = sc.nextInt(); } for
		 * (int i = arr.length - 1; i >= 0; i--) { System.out.print(arr[i] + " "); }
		 * sc.close();
		 * 
		 * // 06
		 * 
		 * Scanner sc = new Scanner(System.in); String str = sc.nextLine(); char[] arr =
		 * str.toCharArray(); for (int i = arr.length - 1; i >= 0; i--) {
		 * System.out.print(arr[i]); } sc.close();
		 * 
		 * // 07
		 * 
		 * Scanner sc = new Scanner(System.in); int a = sc.nextInt(); int b =
		 * sc.nextInt(); int gcd = getGCD(a, b); System.out.println("최소공배수: " + ((a * b)
		 * / gcd) + ", 최대공약수: " + gcd); sc.close();
		 * 
		 * // 08-1
		 * 
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 * 
		 * // 08-2
		 * 
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < i; j++) {
		 * System.out.print(" "); } for (int j = i; j < 5; j++) { System.out.print("*");
		 * } System.out.println(); }
		 * 
		 * // 09
		 * 
		 * Scanner sc = new Scanner(System.in); int sum = 0; String str; while (true) {
		 * System.out.print("값: "); str = sc.nextLine(); if (str.equals("q")) break;
		 * else { sum += Integer.parseInt(str); System.out.println("합: " + sum); } }
		 * sc.close();
		 */

	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int getGCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return getGCD(b, a % b);
	}

}
