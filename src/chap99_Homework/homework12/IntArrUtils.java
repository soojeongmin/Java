package chap99_Homework.homework12;

import java.util.Arrays;

public class IntArrUtils {

	public static int getMax(int[] numArr) {
		Arrays.sort(numArr);
		return numArr[numArr.length-1];
	}

	public static int getMin(int[] numArr) {
		Arrays.sort(numArr);
		return numArr[0];
	}

	public static int getMid(int[] numArr) {
		Arrays.sort(numArr);
		if(numArr.length%2==0) return numArr[numArr.length/2];
		else return numArr[numArr.length/2];
	}

}
