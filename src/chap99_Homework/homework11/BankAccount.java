package chap99_Homework.homework11;

public class BankAccount {
	private long balance;
	
	public BankAccount(long balance) {
		this.balance = balance;
	}
	
	public void deposit(long cash) {
		this.balance += cash;
		System.out.println("입금액: "+cash+"원");
	}
	
	public void withdraw(long cash) {
		this.balance -= cash;
		System.out.println("출금액: "+cash+"원");
	}
	
	public void balanceInquiry() {
		System.out.println("잔고: "+this.balance+"원");
	}
}
