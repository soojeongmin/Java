package chap99_Homework.homework04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayUtility2 {
	static int[] concat(int[] s1, int[] s2) {
		int[] dest = new int[s1.length + s2.length];
		int index = 0;
		for (int i = 0; i < s1.length; i++)
			dest[i] = s1[i];
		for (int i = s1.length; i < s1.length + s2.length; i++) {
			dest[i] = s2[index];
			index++;
		}
		for (int i = 0; i < dest.length; i++)
			System.out.print(dest[i] + " ");
		return dest;
	}

	static int[] remove(int[] s1, int[] s2) {
		/*
		 * GPT 참고 코드
		 * boolean[] flag = new boolean[s1.length];
		 * 
		 * for (int i = 0; i < s1.length; i++) flag[i] = false;
		 * 
		 * for (int i = 0; i < s1.length; i++) { for (int j = 0; j < s2.length; j++) {
		 * if (s1[i] == s2[j]) { flag[i] = true; } } }
		 * 
		 * int count = 0;
		 * 
		 * for(int i=0;i<flag.length;i++) if(flag[i]==false) count++;
		 * 
		 * int[] dest = new int[count]; int index = 0;
		 * 
		 * for (int i = 0; i < s1.length; i++) { if (!flag[i]) dest[index++] = s1[i]; }
		 * 
		 * for (int i = 0; i < dest.length; i++) System.out.print(dest[i] + " "); return
		 * dest;
		 */
		
		int[] dest = new int[s1.length];
		int index = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i] == s2[j]) {

				}
				else {
					dest[index] = s1[i];
					index++;
				}
			}
		}
		for (int i = 0; i < dest.length; i++) System.out.print(dest[i] + " ");
		return dest;
	}

	public static int[] remove3(int[] s1, int[] s2) {
		boolean[] isPresent = new boolean[1001];
		for(int num:s2) isPresent[num] = true;
		int[] temp = new int[s1.length];
		int index = 0;
		for(int num :s1) {
			if(!isPresent[num]) {
				temp[index++] = num;
			}
		}
		
		int[] returnArr = new int[index];
		System.arraycopy(temp, 0, returnArr, 0, index);
		return returnArr;
	}
	
	public static int[] remove4(int[] s1, int[] s2) {
		Set<Integer> set = new HashSet<>();
		for(int num: s2) {
			set.add(num);
		}
		return Arrays.stream(s1).filter(num -> !set.contains(num)).toArray();
		// filter: 조건이 true인 값만 모아서 stream<Integer>로 만든다.
	}
	
	
	public static void main(String[] args) {
		concat(new int[] { 1, 2, 3, 4, 5 }, new int[] { 4, 5, 6, 7, 8 });
		System.out.println();
		remove(new int[] { 1, 2, 3, 4, 5 }, new int[] { 4, 5, 6, 7, 8 });
	}
}
