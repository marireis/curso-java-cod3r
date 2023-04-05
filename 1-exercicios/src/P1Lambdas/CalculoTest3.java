package P1Lambdas;

import java.util.function.BinaryOperator;
public class CalculoTest3 {
	public static void main(String[] args) {
		//funcão do java
		BinaryOperator<Double> soma = (x, y) -> {return  x+ y; };
		System.out.println(soma.apply(2.0, 3.0));
		
		soma = (x, y) -> x * y;
		System.out.println(soma.apply(2.0, 3.0));
		System.out.println(Calculo.muitoLegal());
	}
}
