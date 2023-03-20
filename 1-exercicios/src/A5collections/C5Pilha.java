package A5collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class C5Pilha {
	
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");//adicionado primeiro
		livros.push("Dom QUixote");
		livros.push("O hobbit");//adiciona por ultimo
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());//remove hobbit
		System.out.println(livros.poll());//remove don
		System.out.println(livros.poll());//remove o pequeno...
		System.out.println(livros.poll());//retorna nulo caso nao tenha na fila para remover
		System.out.println(livros.pop());//retorna exceção caso nao tenha para remover
	}

}
