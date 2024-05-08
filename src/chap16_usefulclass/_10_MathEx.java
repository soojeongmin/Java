package chap16_usefulclass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// 사용자가 5개의 정수를 입력하고 배열에 저장
		// 배열에 저장된 정수 5개 중 최대값과 최소값을 구하시오
		// Math.max와 Math.min 메소드를 이용하세요.
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0, min = 0;
		for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
		min = arr[0];
		for (int i = 0; i < 5; i++) {
			if (arr[i] > max) max = Math.max(arr[i], max);
			if (arr[i] < min) min = Math.min(arr[i], min);
		}
		System.out.println("[max: " + max + ", min: " + min + "]");
		sc.close();
	}

}
