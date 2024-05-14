package chap99_Homework.homework11;

public class _01_Basic {
	public static void main(String[] args) {
		// basic 01, 02
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 20; i++) {
					if (30 % i == 0)
						System.out.println(i);
				}
			}
		});

		thread.start();
		try {
			thread.join();
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}

		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0 && i % 4 == 0 && i != 0)
				System.out.println(i);
		}
	}

}
