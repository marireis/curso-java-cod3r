package collections;

import java.util.LinkedList;
import java.util.Queue;

public class C4Fila {//manipular fila
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//Adicionam elementos na fila
		//DIFERENÇA NO COMPORTAMENTO OCORRE QUANDO A FILA ESTÁ CHEIA
		fila.add("Ana");//gera erro caso nao consiga adicionar na fila
		fila.offer("Bia");//retorna V-F ao adicionar a fila com restrição, caso false joga uma exceção
		fila.offer("Luis");
		fila.offer("Mara");
		fila.offer("Gui");
		
		//DIFERENÇA OCORRE QUANDO A FILA ESTÁ VAZIA
		System.out.println(fila.peek());//se a fila estiver vazia - retrorna nulo, nao gera problema
		System.out.println(fila.element());//se a fila estiver vazia joga exceção NOSUCHELEMENTEXCEPTION
		
//		fila.clear();//limpar
//		fila.size();
//		fila.isEmpty();//vazio
//		fila.contains();
		
		//OS DOIS REMOVEM DA FILA - obtem o prox elemento da fila e remove
		//DIFERENÇA OCORRE QUANDO A FILA ESTÁ VAZIA
		System.out.println(fila.poll());//retorna falso ao remover se não tiver
		System.out.println(fila.remove());//lança uma exceção ao remover caso a fila esteja vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		
	}

}
