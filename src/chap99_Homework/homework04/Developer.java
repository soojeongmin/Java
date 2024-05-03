package chap99_Homework.homework04;

public class Developer extends Worker {

	@Override
	public void comeToWork() {
		// TODO Auto-generated method stub
		System.out.println("백팩을 메고 출근한다.");
	}

	@Override
	public void finishWork() {
		// TODO Auto-generated method stub
		System.out.println("개발을 끝마친다.");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("열심히 개발한다.");
	}

}
