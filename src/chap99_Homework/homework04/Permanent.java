package chap99_Homework.homework04;

public class Permanent extends Employee {
	public int bonus;
	
	public Permanent(int eno, String name, int pay, int type, int bonus) {
		super(eno, name, pay, type);
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		return this.getPay() / 12 + this.bonus / 12;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("보너스 : " + bonus);
		System.out.println("월급 : " + this.getMonthPay());
	}

}
