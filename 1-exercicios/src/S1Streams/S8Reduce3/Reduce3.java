package S1Streams.S8Reduce3;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

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
		
		//acumulador a media e o double como item atual
	    //acumulador, valor e resultao
		BiFunction<Media, Double, Media> calcMedia = (media, nota) -> media.adicionar(nota);
		
		BinaryOperator<Media> combinarMedia = (m1,m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.stream()
		.filter(aprovado) //operacao intermediaria
		.map(apenasNota) //operacao intermediaria
		.reduce(new Media(), calcMedia, combinarMedia);
		
		System.out.println("Media dos aprovados : " + media.getValor());
		
	}
}
