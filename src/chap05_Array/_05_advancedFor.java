package chap05_Array;

public class _05_advancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 향상된 for
		// 기존 for문은 배열의 인덱스를 이용해서 배열 요소에 접근하는 방식
		// 향상된 for문은 배열의 요소(값)에 직접 접근하는 방식
		int[] scores = {100,84,56,78,67};
		int sum = 0;
		//scores 배열의 점수가 순차적으로 한번씩 score 변수에 담긴다
		for(int score:scores) {
			System.out.println(score);
			sum += score;
		}
		System.out.println("점수의총합: "+sum);
		double avg = (double)sum/scores.length;
		System.out.println("점수의평균: "+avg);
	}

}
