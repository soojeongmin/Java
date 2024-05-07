package chap99_Homework.homework05;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		System.out.println("하이브리드 차량이 속도를 높인다.");
	}

	@Override
	public void speedDown() {
		System.out.println("하이브리드 차량이 속도를 낮춘다.");
	}

	@Override
	public void addFuel() {
		System.out.println("하이브리드 차량이 기름을 넣는다.");
	}

	@Override
	public void charge() {
		System.out.println("하이브리드 차량이 전기를 충전한다.");
	}

}
