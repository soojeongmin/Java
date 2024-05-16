package chap99_Homework.homework11;

public class Student {
	// 01
	private String name;
	private int sno;
	private String major;

	public Student() {

	}
	
	public void setStudentInfo(String name, int sno, String major) {
		this.name = name;
		this.sno = sno;
		this.major = major;
	}

	public void printStudentInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("학번: " + this.sno);
		System.out.println("학과: " + this.major);
	}
}
