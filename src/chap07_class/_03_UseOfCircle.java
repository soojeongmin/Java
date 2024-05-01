package chap07_class;

import chap07_class.circle.Circle;

public class _03_UseOfCircle {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println(circle.diameter());
		System.out.println(circle.area());
	}
}
