package collections;

import java.util.HashSet;

public class C7Hash {

	public static void main(String[] args) {
		
		HashSet<C3Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new C3Usuario("Pedro"));
		usuarios.add(new C3Usuario("Ana"));
		usuarios.add(new C3Usuario("Guilherme"));
		
		boolean result = usuarios.contains(new C3Usuario("Guilherme"));
		System.out.println(result);
	}
}
