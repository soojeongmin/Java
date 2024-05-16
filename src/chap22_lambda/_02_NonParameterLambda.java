package chap22_lambda;

import chap22_lambda.basiclambda.Add;

public class _02_NonParameterLambda {

	public static void main(String[] args) {
		// 1. 매개변수가 없는 함수형 인터페이스의 추상메소드 람다식으로 구현
		add(()->{System.out.println(30+40);});
		add(()->{System.out.println(50+100);});
	}
	
	// 함수형 인터페이스를 매개변수로 받는 메소드 선언
	public static void add(Add add) {
		add.add();
	}
}







