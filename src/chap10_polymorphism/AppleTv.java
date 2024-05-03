package chap10_polymorphism;

import chap10_polymorphism.tv.Tv;

public class AppleTv extends Tv {
	@Override
	public void powerOn() {
		System.out.println("AppleTv");
		powerOn();
	}
	
	@Override
	public void powerOff() {
		System.out.println("AppleTv");
		powerOff();
	}
	
	// Tv와 AppleTv가 다른 패키지에 속해있기 때문에
	// default 접근제어자로 선언된 operate 메소드는
	// 오버라이드 할 수 없다.
	// @Override
	//public void operate(int channel) { }
	
	public void testTv() {
		powerOn();
		powerOff();
		// super.operate(11);
		// super.channelUp();
		
	}

	@Override
	public void operate(int channel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTo(int channel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		
	}
}
