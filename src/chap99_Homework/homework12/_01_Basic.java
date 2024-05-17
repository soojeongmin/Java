package chap99_Homework.homework12;

public class _01_Basic {

	public static void main(String[] args) {
		// 1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요.
		// PrintNumber 함수형 인터페이스 생성, printEvenNum(int[] numArr) 추상 메소드로 선언.
		printNum(arr -> {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0)
					System.out.print(arr[i] + " ");
			}
		});
	}

	public static void printNum(PrintNumber printNumber) {
		int[] numArr = new int[5];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;
		numArr[3] = 4;
		numArr[4] = 5;
		printNumber.printEnvenNum(numArr);
	}
}
