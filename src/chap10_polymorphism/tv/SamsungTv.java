package chap10_polymorphism.tv;

public class SamsungTv extends Tv {
	public int channel;
	
	@Override
	public void powerOn() {
		System.out.println("OLED");
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("OLED");
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void operate(int channel) {
		System.out.println("OLED");
		System.out.println(channel+ "로 오퍼레이트");
	}

	@Override
	public void moveTo(int channel) {
		// TODO Auto-generated method stub
		System.out.println(channel+"로 채널을 옮깁니다.");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		channel++;
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		channel--;
	}
}
