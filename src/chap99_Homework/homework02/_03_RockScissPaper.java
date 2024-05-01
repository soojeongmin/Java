package chap99_Homework.homework02;

import java.util.Random;
import java.util.Scanner;

public class _03_RockScissPaper {
	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();

	private boolean isExit = false;

	private int gameCnt = 0;
	private int winCnt = 0;
	private int drawCnt = 0;
	private int loseCnt = 0;

	//게임을 시작하는 메소드
	public void start() {
		int human, com;
		while(!isExit) {
			System.out.println("0(가위), 1(바위), 2(보): ");
			human = sc.nextInt();
			if(human==3) {
				System.out.println(gameCnt+"전 "+winCnt+"승 "+drawCnt+"무 "+loseCnt+"패");
				isExit=true;
				break;
			}
			else {
				com = rd.nextInt(3);
				printCom(com);
				judgeWDL(human, com);
			}
		}
	}

	//승무패 판단해주는 메소드
	public void judgeWDL(int user, int com) {
		if((user==0 && com==2)||(user==1 && com==0)||(user==2 && com==1)) {
			System.out.println("이겼습니다.");
			winCnt++;
		}
		else if(user==com) {
			System.out.println("비겼습니다.");
			drawCnt++;
		}
		else {
			System.out.println("졌습니다.");
			loseCnt++;
		}
		gameCnt++;
	}

	//컴퓨터 가위, 바위, 보 출력해주는 메소드
	public void printCom(int com) {
		switch(com) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
		}
	}
}