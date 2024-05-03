package chap99_Homework.homework04;

public class Contract extends Employee {
	public int workDay;
	
	public Contract(int eno, String name, int pay, int type, int workDay) {
		super(eno, name, pay, type);
		this.workDay = workDay;
	}
	
	@Override
	public double getMonthPay() {
		return this.getPay() * this.workDay;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무일수 : " + this.workDay);
		System.out.println("월급 : " + this.getMonthPay());
	}
}
