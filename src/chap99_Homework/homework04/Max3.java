﻿package chap99_Homework.homework04;

import java.util.Arrays;
import java.util.Scanner;
// 3개의 정숫값을 입력하고 최댓값을 구합니다.

class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();
		
		int max = a;
		
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		Arrays.sort(arr);
		max = arr[2];

		System.out.println("최댓값은 " + max + "입니다.");
	}
}