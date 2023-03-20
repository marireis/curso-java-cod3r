package collections;

import java.util.ArrayList;

public class C3Lista {
	
	public static void main(String[] args) {
		
		ArrayList<C3Usuario> lista = new ArrayList<>();
		C3Usuario u1 = new C3Usuario("Ana");
		
		lista.add(u1);
		lista.add(new C3Usuario("Carlos"));
		lista.add(new C3Usuario("Joao"));
		lista.add(new C3Usuario("Rui"));
		lista.add(new C3Usuario("Bia"));
		
		System.out.println(lista.get(3).nome);
		
		System.out.println("================");
		
		System.out.println("Remoção: " + lista.remove(1));
		
		System.out.println("TEM ? " + lista.contains(new C3Usuario("Bia")));
		
		System.out.println("Dentro do FOR +++++++++++++");
		for(C3Usuario u : lista) {
			
			
			System.out.println(u.nome);
			
			System.out.println(u.toString());//usando método toString no Usuario
		}
	}

}
