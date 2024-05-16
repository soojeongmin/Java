package chap99_Homework.homework11;

public class Developer implements Employee {

	@Override
	public void goToWork() {
		System.out.println("개발자는 백팩을 메고 출근합니다.");
	}

	@Override
	public void backToHome() {
		System.out.println("개발자는 버스를 타고 퇴근합니다.");
	}

	@Override
	public void work() {
		System.out.println("개발자는 자바로 개발을 합니다.");
	}

}
