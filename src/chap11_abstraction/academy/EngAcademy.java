package chap11_abstraction.academy;

public class EngAcademy extends Academy {

	@Override
	public void teach() {
		System.out.println("영어를 가르친다.");

	}

	@Override
	public void solveHomework() {
		System.out.println("영문법 숙제를 풀어준다.");

	}

	@Override
	public void rest() {
		System.out.println("영어 수업이 끝나고 쉰다.");

	}

	@Override
	public void attend() {
		System.out.println("영어 수업에 참여한다.");

	}

}
