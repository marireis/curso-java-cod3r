package P1Lambdas.L7operadorUnario;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> AoQuadrado = n -> n * n;
		
		int result1 = maisDois.andThen(vezesDois).andThen(AoQuadrado).apply(0);
		System.out.println(result1);
		
		int result2 = AoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		System.out.println(result2);
	}

}
