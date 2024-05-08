package chap99_Homework.homework07;

import java.util.Scanner;

public class _01_Basic {

	public static void main(String[] args) {
		// basic 01
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		StringBuffer sb3 = new StringBuffer(s3);
		
		sb1 = sb1.append(sb2).append(sb3);
		System.out.println(sb1);
		
		// basic 02
		StringBuffer sb4 = new StringBuffer(30);
		sb4.append("hello");
		int remainBufferSize = sb4.capacity() - sb4.length();
		for (int i = 0; i < remainBufferSize; i++) {
			sb4.append("a");
		}
		System.out.println(sb4);
		sc.close();
	}

}
