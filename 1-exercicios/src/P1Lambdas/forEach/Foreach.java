package P1Lambdas.forEach;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia");
	
		System.out.println("Forma tradicional");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambdas #01 ...");
		aprovados.forEach(nome -> {System.out.println(nome + "!!!");});
	
		
		System.out.println("\nMethod Reference...");
		aprovados.forEach(System.out::println);//passar um referencia de um métódo = endereço de memoria
	
		System.out.println("\nLambdas #02 ...");
		aprovados.forEach(nome -> {meuImprimir(nome);});
	
		System.out.println("\nMethod Reference 2...");
		aprovados.forEach(Foreach::meuImprimir);//passar um referencia de um métódo = endereço de memoria
	
	}
	
		static void meuImprimir(String nome) {
			System.out.println("Oi, meu nome é " + nome);
		}

}
