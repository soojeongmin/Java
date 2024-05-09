package chap99_Homework.homework07;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Advance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StringBuilder sb = new StringBuilder(sc.nextLine());

		for (int i = 1; i < sb.length(); i++) {
			if (sb.charAt(i) == sb.charAt(i - 1)) {
				sb = sb.delete(i, i + 1);
				i--;
			}
		}
		System.out.println(sb);
		sc.close();
	}

}
