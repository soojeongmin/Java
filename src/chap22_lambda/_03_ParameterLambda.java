package chap22_lambda;

import chap22_lambda.basiclambda.Mul;
import chap22_lambda.basiclambda.MulAndDiv;
import chap22_lambda.basiclambda.SingleMul;

public class _03_ParameterLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2= 20;
		singleMul(num1, (a)->{System.out.println(a*a);});
		// 매개변수 하나면 소괄호 생략 가능
		singleMul(num2, a->{System.out.println(a*a);});
		mul(num1, num2, (a, b)->{System.out.println(a*b);});
		
		MulAndDiv mulAndDiv = new MulAndDiv();
		mulAndDiv.singleMul(num1,  a->{System.out.println(a*a*a*a);});
		mulAndDiv.mul(num1, num2, (a,b)->{System.out.println(a*b*a);});
		mulAndDiv.div(num1, num2, (a,b)->{System.out.println((double)a/b);});
	}
	public static void mul(int a, int b, Mul mul) {
		mul.multiply(a, b);
	}
	
	public static void singleMul(int a, SingleMul singleMul) {
		singleMul.singleMultiply(a);
	}
}
