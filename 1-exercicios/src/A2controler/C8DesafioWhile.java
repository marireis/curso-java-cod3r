package A2controler;

import java.util.Scanner;

public class C8DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Você diz:");
			entrada.nextLine();
		
		}
		
		
		entrada.close();
	}
}
