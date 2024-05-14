package chap21_multithread;

import chap21_multithread.threads.DeamonThread;

public class _12_DeamonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeamonThread dt = new DeamonThread();
		
		dt.setDaemon(true);
		dt.start();
		try {
			Thread.sleep(30000);
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		// 주 스레드인 메인 스레드가 종료되면 보조 스레드인 dt도 종료된다.
		System.out.println("메인 스레드 종료");
	}

}
