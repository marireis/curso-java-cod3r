package S1Streams.T1Match;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class MatchMain {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 5);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		//Predicato recebe aluno e retorna v/f - SERVE PARA QUANDO QUISER FILTRAR
		Predicate<Aluno> aprovado = a -> a.nota >= 7; 
		
		Predicate<Aluno> reprovado = aprovado.negate(); 
		
		
		System.out.println(alunos.stream().allMatch(aprovado));//todos sao aprovados?
		System.out.println(alunos.stream().anyMatch(aprovado));//algum aprovado?
		System.out.println(alunos.stream().noneMatch(aprovado));//nenhum aprovado?
		
		System.out.println(alunos.stream().noneMatch(aprovado.negate()));//negando nenhum aprovado?
		System.out.println(alunos.stream().noneMatch(reprovado));//nenhum reprovado?
	}
}
