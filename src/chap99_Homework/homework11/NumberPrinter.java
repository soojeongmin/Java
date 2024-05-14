package chap99_Homework.homework11;

public class NumberPrinter {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public synchronized void numPrint1(int num) {
		this.setNum(num);
		for (int i = this.num; i <= 50; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println("np1: "+i);
				notify();
				try {
					wait();
				} catch(InterruptedException ie) {
					System.out.println(ie.getMessage());
				}
			}
		}
	}

	public synchronized void numPrint2(int num) {
		this.setNum(num);
		for (int i = this.num; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0 && i != 0) {
				System.out.println("np2: "+i);
				//Thread.yield();
				notify();
				try {
					wait();
				} catch(InterruptedException ie) {
					System.out.println(ie.getMessage());
				}
			}
		}
	}
}
