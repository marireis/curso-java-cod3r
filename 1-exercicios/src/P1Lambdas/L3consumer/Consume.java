package P1Lambdas.L3consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consume {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = 
				p -> System.out.println(p.nome + "!!!!!") ;
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		
		imprimirNome.accept(p1);//recebe 1 parametro e nao retorna nada
		
		Produto p2 = new Produto("Borracha", 12.34, 0.09);
		Produto p3 = new Produto("Caderno",15.4, 0.09);
		Produto p4 = new Produto("Lapis", 12.34, 0.09);
		Produto p5 = new Produto("Notebook", 12.34, 0.09);
		
		List<Produto>produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		//foreach espera receber um consumer,
		produtos.forEach(imprimirNome);
		//foreach pode passar uma lambda que passa um consumer por baixo
		produtos.forEach(p -> System.out.println(p.preco));
		//ou chamando tostring
		produtos.forEach(System.out::println);
		
	}

}
