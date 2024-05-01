package chap99_Homework.homework02;

public class _02_Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		arr = reverse(arr);
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		
		char[] chArr = {'A','B','c','D','E'};
		chArr = reverseAlphabet(chArr);
		System.out.println(chArr[0]+" "+chArr[1]+" "+chArr[2]+" "+chArr[3]+" "+chArr[4]);
	}

	// Middle 1
	public static int[] reverse(int[] arr) {
		int[] rev = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			rev[(arr.length - 1) - i] = arr[i];
		}
		return rev;
	}

	// Middle 2
	public static char[] reverseAlphabet(char[] chArr) {
		char[] convertArr = new char[chArr.length];
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] >= 65 && chArr[i] <= 90) {
				convertArr[i] = Character.toLowerCase(chArr[i]);
				if (convertArr[i] == 'a')
					convertArr[i] = 'z';
				else
					convertArr[i]++;
			} else {
				convertArr[i] = Character.toUpperCase(chArr[i]);
				if (convertArr[i] == 'A')
					convertArr[i] = 'Z';
				else
					convertArr[i]--;
			}
		}
		return convertArr;
	}
}
