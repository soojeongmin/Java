package chap99_Homework.homework11;

public class _02_Basic {

	public static void main(String[] args) {
		// Basic 03 04 05
		NumberPrinter np = new NumberPrinter();
		
		SyncThread01 st01 = new SyncThread01();
		SyncThread02 st02 = new SyncThread02();
		
		st01.setNp(np);
		st02.setNp(np);
		
		st01.start();
		st02.start();
	}

}
