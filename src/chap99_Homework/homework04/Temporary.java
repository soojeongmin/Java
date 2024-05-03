package chap99_Homework.homework04;

public class Temporary extends Employee {
	public int hireYear;

	public Temporary(int eno, String name, int pay, int type, int hireYear) {
		super(eno, name, pay, type);
		this.hireYear = hireYear;
	}
	
	@Override
	public double getMonthPay() {
		return this.getPay() / 12;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무년수 : " + this.hireYear);
		System.out.println("월급 : " + this.getMonthPay());
	}
}
