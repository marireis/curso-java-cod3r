package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class C2ConjuntoComportado {
	
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<>();
		lista.add("marina");
		lista.add("ana");
		lista.add("mari");
		lista.add("ina");
		
		System.out.println(lista);
		
		for (String candidato : lista) {
			System.out.println(candidato);
		}
		System.out.println("==========================");
		
		SortedSet<String> lista2 = new TreeSet();
		lista2.add("marina");
		lista2.add("ana");
		lista2.add("mari");
		lista2.add("ina");
		
		System.out.println(lista2);
		
		for (String candidato1 : lista2) {
			System.out.println(candidato1);
		}
	
	}

}
