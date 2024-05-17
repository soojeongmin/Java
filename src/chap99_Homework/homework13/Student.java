package chap99_Homework.homework13;

public class Student {
	private int sno;
	private String name;
	private int score;
	private String grade;
	
	public Student() {
		
	}
	
	public Student(int sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", score=" + score + ", grade=" + grade + "]";
	}
	
	public void studentInfo() {
		System.out.println("학번: " + this.sno);
		System.out.println("이름: " + this.name);
		System.out.println("점수: " + this.score);
		System.out.println("학점: " + this.grade);
	}
	
	
}
