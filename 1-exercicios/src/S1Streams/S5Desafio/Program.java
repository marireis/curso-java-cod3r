package S1Streams.S5Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import S1Streams.Filter.Aluno;

public class Program {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Café", 7.8, 0.15, 5.0);
		Produto p2 = new Produto("Açucar", 5.0, 0, 3.0);
		Produto p3 = new Produto("Arroz", 5.0, 0, 10.0);
		Produto p4 = new Produto("Feijao", 7.8, 0.3, 0);
		Produto p5 = new Produto("Sal", 5.3, 0.1, 0);
		Produto p6 = new Produto("Biscoito", 3.5, 0.5, 0);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		Predicate<Produto>freteGratis = p -> p.valorFrete == 0;
		
		Predicate<Produto>descontoPromo = p -> p.desconto >= 0.1;
		
		Predicate<Produto>prodRelevante = p -> p.valor >= 5;


		Function<Produto, String> chamadaPromo = p -> "Aproveite! " + p.nome + " por R$: " + p.valor;
		
		
		produtos.stream()
		.filter(descontoPromo)
		.filter(freteGratis)
		.filter(prodRelevante)
		.map(chamadaPromo)
		.forEach(System.out::println);
	}

}
