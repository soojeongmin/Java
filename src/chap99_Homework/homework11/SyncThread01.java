package chap99_Homework.homework11;

public class SyncThread01 extends Thread {
	private NumberPrinter np;
	
	public void setNp(NumberPrinter np) {
		this.np = np;
	}
	
	public NumberPrinter getNp() {
		return this.np;
	}
	
	@Override
	public void run() {
		np.numPrint1(10);
	}
}
