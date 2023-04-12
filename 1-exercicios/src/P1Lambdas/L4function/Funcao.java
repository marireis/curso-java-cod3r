package P1Lambdas.L4function;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Ímpar"; 
		
		
		Function<String, String> oResultadoEh = valor -> "O resultado é: " + valor;
		
		
		Function<String, String> empolgado = valor ->  valor + "!!!!";
		
		Function<String, String> duvida = valor ->  valor + "???????";
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoEh)
				.andThen(empolgado)
				.apply(32);//concatena 2 funções

		System.out.println(resultadoFinal);
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoEh)
				.andThen(duvida)
				.apply(33);//concatena 2 funções
		
		System.out.println(resultadoFinal2);
	
		System.out.println(parOuImpar.apply(33));
	}

}
