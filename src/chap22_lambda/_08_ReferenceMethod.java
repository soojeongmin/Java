package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.reference.Converter;
import chap22_lambda.reference.MoneyConvertor;

public class _08_ReferenceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertMoney((a, b)->MoneyConvertor.staticConvert(a,b));
		// 2. 위의 내용을 메소드 참조형식으로 구성
		// 메소드를 참조해서 람다식으로 구현하려면
		// 참조하는 메소드의 형태가 함수형 인터페이스에 선언한
		// 추상메소드의 형태와 동일해야 한다.
		// 리턴타입, 매개변수의 순서, 개수, 타입이 모두 동일해야 메소드를 참조해서 사용할 수 있다.
		// 3. static 메소드를 참조해서 사용할 때는 클래스명::참조할 메소드명으로 메소드를 참조한다.
		convertMoney(MoneyConvertor::staticConvert);
		
		MoneyConvertor moneyConvertor = new MoneyConvertor();
		convertMoney(moneyConvertor::instanceConvert);
		// 5. 추상메소드와 형태가 다른 메소드는 참조해서 사용할 수 없다.
		// convertMoney(moneyConvertor::otherConvert);
		
//		convertMoney((a,b)->{
//			moneyConvertor.otherConvert(a, b, "aaaa");
//			return 1000;
//		});
	}

	public static void convertMoney(Converter convertor) {
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 원화를 입력하세요: ");
		int money = sc.nextInt();
		sc.nextLine();

		System.out.print("환전할 통화의 기호를 입력하세요($,€): ");
		String str = sc.nextLine();

		int result = convertor.convert(money, str.charAt(0));
		System.out.println("환전 결과: " + str.charAt(0) + result);
	}

}
