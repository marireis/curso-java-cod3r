package A2controler;

import java.util.Scanner;

public class C9DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		do {
			System.out.println("Você precisa falar as palavras mágicas");
			
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
	}while(!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado.");
		entrada.close();
	}

}
