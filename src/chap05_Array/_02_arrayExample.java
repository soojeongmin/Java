package chap05_Array;

public class _02_arrayExample {

	public static void main(String[] args) {
		// 1. 10개의 정수를 저장하는 배열을 생성하고 3의 배수만 10개 저장하세요.
		int[] numArr = new int[11];
		
		int i=0;
		while(i<numArr.length-1)
		{
			numArr[i] = (i+1)*3;
			System.out.println(numArr[i]);
			i++;
		}
		
	}

}
