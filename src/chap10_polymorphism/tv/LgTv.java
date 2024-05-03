package chap10_polymorphism.tv;

public class LgTv extends Tv {
	public int channel;
	
	@Override
	public void powerOn() {
		System.out.println("QLED");
		// super 키워드로 생성자를 호출할 때는 항상 최상단에서 사용해야 하지만
		// 인스턴스 메소드를 사용할 때 위치는 중요하지 않다.
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("QLED");
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void operate(int channel) {
		System.out.println("QLED");
		System.out.println(channel+ "로 채널 선택");
	}
	
	
	public void testTv() {
		// 부모클래스에 public으로 선언된 메소드
		powerOn();
		
		// 부모클래스에 protected로 선언된 메소드
		powerOff();
		
		// 부모클래스에 default로 선언된 메소드
		operate(11);;
		
		// 부모클래스에 private으로 선언된 메소드
		//super.channelUp();
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
