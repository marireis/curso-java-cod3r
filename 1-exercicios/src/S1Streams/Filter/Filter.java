package S1Streams.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import P1Lambdas.L1forEach.Foreach;

public class Filter {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.0);
		Aluno a3 = new Aluno("Teo", 8.8);
		Aluno a4 = new Aluno("Pedro", 3.1);
		Aluno a5 = new Aluno("Lia", 9.8);
		Aluno a6 = new Aluno("Jose", 7.8);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		
		
		alunos.stream()
		.filter(a -> a.nota >= 7)
		.map(a -> "Parabens! " + a.nome + " você foi aprovado!")
		.forEach(System.out::println);
		
		System.out.println("\n#########################\n");
		//OUUU
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacao = a ->  "Parabens! " + a.nome + " você foi aprovado!";
	
	
		alunos.stream()
		.filter(aprovado)
		.map(saudacao)
		.forEach(System.out::println);
		
	}

}
