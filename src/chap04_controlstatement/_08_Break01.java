package chap04_controlstatement;

import java.util.Scanner;
// 자동임포트: ctrl+shift+o 이클립스에서만 동작
public class _08_Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 0을 입력하기 전까지 입력한 모든 정수의 합을 출력
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.println("숫자를 입력하세요(0입력시 종료)");
			int userNum = sc.nextInt();
			if(userNum==0) {
				System.out.println("프로그램을종료합니다.");
				//while문의 종료
				break;
			}
			System.out.println("입력숫자: "+userNum);
			sum+=userNum;
		}
		
		System.out.println("지금까지 입력한 수의 합은: "+sum);
		sc.close();
		
		
		
	}

}
