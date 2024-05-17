package chap99_Homework.homework12;

public class _02_Middle02 {

	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3, 4, 5 };
		
		MaxMinMid getMax = IntArrUtils::getMax;
		System.out.println(getMax.maxOrMinOrMid(numArr));

		MaxMinMid getMin = IntArrUtils::getMin;
		System.out.println(getMin.maxOrMinOrMid(numArr));

		MaxMinMid getMid = IntArrUtils::getMid;
		System.out.println(getMid.maxOrMinOrMid(numArr));
	}

}
