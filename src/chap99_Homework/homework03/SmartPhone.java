package chap99_Homework.homework03;

public class SmartPhone {
	public String model;
	public String company;
	public int volume;

	public SmartPhone() {
		this.company = "Apple";
		this.model = "iPhone SE";
		this.volume = 0;
	}
	
	public void printModelInfo() {
		System.out.println("제조회사: "+this.company);
		System.out.println("모델명: "+this.model);
	}
	
	public void volumeUp() {
		this.volume++;
		System.out.println("소리 올림");
	}
	
	public void volumeDown() {
		this.volume--;
		System.out.println("소리 줄임");
	}
}
