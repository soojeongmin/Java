package chap99_Homework.homework02;

public class _01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5));

		System.out.println(ConcatString("asdf", "zxcv"));
		System.out.println(ConcatString("asdf", "zxcv", 5));

		int[] arr = { 1, 2, 3, 4, 5 };
		reverseArr(arr);
	}

	// basic 1
	public static int sum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}

	// basic 2
	public static String ConcatString(String a, String b) {
		return a + b;
	}

	// basic 3
	public static String ConcatString(String a, String b, int c) {
		return a + b + c;
	}

	// basic 4
	public static void reverseArr(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i]);
	}
}
