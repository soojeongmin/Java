package chap99_Homework.homework07;

import java.util.Scanner;

public class _02_Middle {

	public static void main(String[] args) {
		// middle 01
		StringBuffer sb1 = new StringBuffer(30);
		sb1.append("hello");
		int remainBufferSize = sb1.capacity() - sb1.length();
		for (int i = 1; i <= remainBufferSize; i++) {
			if(i%3==0) sb1.append("t");
			else if(i%2==0) sb1.append("i");
			else if(i%1==0)sb1.append("b");
		}
		System.out.println(sb1);
		
		// middle 02
		StringBuffer sb2 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sb2 = sb2.reverse();
		System.out.println(sb2.charAt(num));
		sc.close();
	}

}
