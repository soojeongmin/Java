package chap07_class.game;

import java.util.Random;
import java.util.Scanner;

public class Numbaseball {
	// 1. 컴퓨터가 0~9까지 숫자중 랜덤한 값 3개를 배열에 저장(중복불가능)
	// 2. 사용자가 0~9까지 숫자 세개 입력(중복불가능)
	// 3. 사용자가 입력한 숫자 중 컴퓨터가 가지고 있는 숫자와 같은 숫자면서 위치가 다르면 볼로 판단
	// 4. 사용자가 입력한 숫자 중 컴퓨터가 가지고 있는 숫자와 같은 숫자면서 위치가 같으면 스트라이크로 판단
	// com {1, 2, 3} user {1, 3, 5} ==> 1 스크라이크, 1 볼
	// com {1, 2, 3} user {4, 5, 6} ==> 0스트라이크, 0볼
	// com {1, 2, 3} user {2, 3, 1} ==> 0스트라이크 3볼
	// com {1,2, 3} user {1,2, 3} ==> 3스트라이크 아웃 게임종료

	
	// 클래스에 필요한 필드
	int strike = 0;
	int ball = 0;
	
	int[] com = new int[3];
	int[] user = new int[3];
	
	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();
	
	public void Numbaseball() {
		
	}
	
	public void start() {
		// com 배열에 3개의 숫자 저장
		for(int i=0;i<3;i++) {
			com[i] = rnd.nextInt(10); // 0~9
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) i--;
			}
		}
		
		for(int i=0;i<3;i++) {
			System.out.print(com[i]+" ");
		}
		System.out.println();
		
		// 3 스트라이크 아웃이 될때까지 사용자의 입력값 받기
		while(true) {
			
			System.out.print("값입력: ");
			for(int i=0;i<3;i++) {
				user[i] = sc.nextInt();
				for(int j=0;j<i;j++) {
					if(user[i]==user[j]) {
						System.out.print("재입력: ");
						i--;
					}
				}
			}

			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==j) {
						if(com[i]==user[j]) strike++;
					}
					else if(com[i]==user[j]) ball++;
				}
			}
			
			if(strike==3) {
				System.out.println(strike+" 스트라이크 아웃 게임종료");
				break;
			}
			else {
				System.out.println(strike+" 스트라이크, "+ball+" 볼");
				strike = 0;
				ball = 0;
			}
		}
		
		
	}
	
}
