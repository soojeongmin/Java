package chap99_Homework.homework11;

public class CivilServant implements Employee {

	@Override
	public void goToWork() {
		System.out.println("공무원은 걸어서 출근합니다.");
	}

	@Override
	public void backToHome() {
		System.out.println("공무원은 정시퇴근을 합니다.");
	}

	@Override
	public void work() {
		System.out.println("공무원은 보고서를 작성합니다.");
	}

}
