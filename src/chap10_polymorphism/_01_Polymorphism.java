package chap10_polymorphism;

import chap10_polymorphism.tv.LgTv;
import chap10_polymorphism.tv.SamsungTv;
import chap10_polymorphism.tv.Tv;

public class _01_Polymorphism {
	public static void main(String[] args) {
		// 1. 다형성을 이용하여 Tv객체 바꾸며 사용하기
		Tv tv = new LgTv();
		tv.powerOn();
		
		tv = new SamsungTv();
		tv.powerOn();
		
		tv = new LgTv();
		tv.operate(11);
		
		tv = new SamsungTv();
		tv.moveTo(3);
	}
}
