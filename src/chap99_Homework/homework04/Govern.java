package chap99_Homework.homework04;

public class Govern extends Worker {

	@Override
	public void comeToWork() {
		// TODO Auto-generated method stub
		System.out.println("걸어서 출근한다.");
	}

	@Override
	public void finishWork() {
		// TODO Auto-generated method stub
		System.out.println("정시에 퇴근한다.");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("민원을 해결한다.");
	}

}
