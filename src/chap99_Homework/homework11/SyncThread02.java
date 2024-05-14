package chap99_Homework.homework11;

public class SyncThread02 extends Thread {
	private NumberPrinter np;

	public void setNp(NumberPrinter np) {
		this.np = np;
	}

	public NumberPrinter getNp() {
		return this.np;
	}

	@Override
	public void run() {
		np.numPrint2(20);
	}
}
