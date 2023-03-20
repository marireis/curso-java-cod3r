package A5collections;

import java.util.HashSet;
import java.util.Set;

public class C1ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })//para tirar advertencias do eclipse
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);//converte do double  -> Double
		conjunto.add(true);// boolean -> Boolean
		conjunto.add("Teste"); //string -> String
		conjunto.add(1); //int -> Integer
		conjunto.add('x'); //char -> Caracter
		
		System.out.println("Tamanho: " + conjunto.size());
		
		conjunto.add("teste"); 
		
		System.out.println("Tamanho: " + conjunto.size());
		
		conjunto.remove('x');
		System.out.println("Tamanho: " + conjunto.size());
		
		
		System.out.println("Tamanho: " + conjunto.contains('x'));
		System.out.println("Tamanho: " + conjunto.contains(1));
		System.out.println("Tamanho: " + conjunto.contains(true));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums);//uniao entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);

		conjunto.clear();
		System.out.println(conjunto);
		
		
	
	}
}
