package chap99_Homework.homework11;

public class Arbeit {
	int workHour;
	int payPerHour;
	
	public Arbeit(int workHour, int payPerHour) {
		this.workHour = workHour;
		this.payPerHour = payPerHour;
	}
	
	public void work() {
		System.out.println(this.workHour+"시간동안 일해서 "+workHour*payPerHour+"원의 급여를 받는다.");
	}
}
