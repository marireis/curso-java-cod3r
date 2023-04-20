package S1Streams.T3OutrasStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 5);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Maria", 5);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Jose", 10);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
	
		System.out.println("\nDISTINCT");
		alunos.stream().distinct().forEach(System.out::println);
		
		//paginação
		System.out.println("\nSKIP - LIMIT");
		alunos.stream()
		.distinct()
		.skip(2)//pula 2 elementos
		.limit(2)//limita somente 2 elementos
		.forEach(System.out::println);
		
		
		System.out.println("\nTakeWhile");
		alunos.stream()
		.distinct()
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
	}
}
