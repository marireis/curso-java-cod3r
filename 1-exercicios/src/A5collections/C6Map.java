package A5collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class C6Map {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		//put adiciona se nao existir e substitui caso exista
		
		usuarios.put(1, "Jose");//adiciona
		usuarios.put(1, "Mar");//altera-susbtitui
		usuarios.put(2, "Lua");
		usuarios.put(3, "Lia");
		usuarios.put(4, "Nina");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());//chaves - nao mantem ordenado
		System.out.println(usuarios.values());//valore
		System.out.println(usuarios.entrySet());//chave e valor
		System.out.println(usuarios.containsKey(2));//verifica se contem a chave no map
		System.out.println(usuarios.containsValue("Nina"));//verifica se contem o valor
		
		System.out.println(usuarios.get(3));
		System.out.println(usuarios.remove(2));
		System.out.println(usuarios.remove(2, "Alberto"));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
	}

}
