package chap16_usefulclass;

import java.math.BigInteger;

public class _17_BigIntegerEx {

	public static void main(String[] args) {
		// 1~100까지 곱한 값을 구하세요.(100 팩토리얼 100!)
		BigInteger bigInt = BigInteger.valueOf(1);
		for (int i = 2; i <= 100; i++) {
			bigInt = bigInt.multiply(BigInteger.valueOf(i));
		}
		System.out.println(bigInt);
		
		long num = factorial(10);
		System.out.println(num);
		System.out.println(factorialBigInteger(BigInteger.valueOf(100)));
	}

	public static long factorial(long num) {
		if (num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}
	
	public static BigInteger factorialBigInteger(BigInteger bigInt) {
		if(bigInt.intValue()==0) return BigInteger.ONE;
		else return bigInt.multiply(factorialBigInteger(bigInt.subtract(BigInteger.valueOf(1))));
		
	}

}
