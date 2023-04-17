package S1Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class S1ImprimindoObjetos {
	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println("Usando Lista");
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Teo", "Ana");
		
		for(int i = 0; i< aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("-------------------------");
		System.out.println("Usando Foreach");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("-------------------------");
		System.out.println("Usando Iterator");
			
		Iterator<String> iterator = aprovados.iterator();	
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("-------------------------");
		System.out.println("Usando Stream - laço interno");
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}

}
