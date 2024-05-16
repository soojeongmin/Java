package chap99_Homework.homework11;

public class Cashier extends Arbeit {

	public Cashier(int workHour, int payPerHour) {
		super(workHour, payPerHour);
	}

	@Override
	public void work() {
		System.out.println("캐셔는 "+this.workHour+"시간동안 일해서 "+workHour*payPerHour+"원의 급여를 받는다.");
	}
}
