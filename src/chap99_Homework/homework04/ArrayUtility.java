package chap99_Homework.homework04;

public class ArrayUtility {
	static double[] intToDouble(int[] source) {
		double[] dest = new double[source.length];
		for(int i=0;i<source.length;i++) dest[i] = (double)source[i];
		return dest;
	}
	
	static int[] doubleToInt(double[] source) {
		int[] dest = new int[source.length];
		for(int i=0;i<source.length;i++) dest[i] = (int)source[i];
		return dest;
	}
	
	public static void main(String[] args) {
		double[] arr = intToDouble(new int[] {1, 2});
		System.out.println(arr[0]+" "+arr[1]);
		
		int[] Arr = doubleToInt(new double[] {1.2, 2.3});
		System.out.println(Arr[0]+" "+Arr[1]);
	}
}
