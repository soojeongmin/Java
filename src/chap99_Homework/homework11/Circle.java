package chap99_Homework.homework11;

public class Circle {
	// 05
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.round(2 * 3.14 * this.radius * this.radius * 100) / 100.0;
	}

	public double getCircumference() {
		return Math.round(4 * 3.14 * this.radius * 100) / 100.0;
	}
}
