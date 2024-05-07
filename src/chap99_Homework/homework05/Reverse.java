package chap99_Homework.homework05;

public class Reverse {
	public static String reverseString(String str) {
		return new StringBuffer(str).reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}
}
