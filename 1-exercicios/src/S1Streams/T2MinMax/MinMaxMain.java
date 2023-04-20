package S1Streams.T2MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class MinMaxMain {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 5);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
	
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		
		System.out.println(alunos.stream().max(melhorNota));
		System.out.println(alunos.stream().min(melhorNota));

		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			return 0;
		};
		System.out.println(alunos.stream().max(piorNota));
	}
}
