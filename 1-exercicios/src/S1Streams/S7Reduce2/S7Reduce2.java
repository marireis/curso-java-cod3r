package S1Streams.S7Reduce2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class S7Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		//Predicato recebe aluno e retorna v/f - SERVE PARA QUANDO QUISER FILTRAR
		Predicate<Aluno> aprovado = a -> a.nota >= 7; 
		
		//FUNÇÃO SERVE PARA TRANSFORMAR O ALUNO EM NOTA
		Function<Aluno, Double> apenasNota = a -> a.nota;
		
		//OPERACÇÃO BINARIA SOMANDO NOTAS = ACUMULADOR
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		
		//alunos.stream() ou 
		alunos.parallelStream()
		.filter(aprovado) //operacao intermediaria
		.map(apenasNota) //operacao intermediaria
		.reduce(somatorio) //operacao de terminacao
		.ifPresent(System.out::println); //somando somente os valores maior que 7
		
	}
}
