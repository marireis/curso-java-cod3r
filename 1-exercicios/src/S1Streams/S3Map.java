package S1Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class S3Map {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//composi��o - expressoes lambdas
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + " ";
		UnaryOperator<String> grito = n -> n + "!!!!!!";
		
		System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));
		
		System.out.println("Usando composi��o ...");
		marcas.stream()
		.map(maiuscula)
		.map(primeiraLetra)
		.map(grito)
		.forEach(print);
		
		
		System.out.println("\nUsando composi��o chamando da classe utilitarios ...");
		marcas.stream()
		.map(S3Utilitarios.maiuscula)
		.map(S3Utilitarios.primeiraLetra)
		.map(S3Utilitarios::grito)
		.forEach(print);
		
	}

}
