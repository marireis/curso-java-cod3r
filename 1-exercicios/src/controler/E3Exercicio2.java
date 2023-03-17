package controler;

import java.util.Scanner;

public class E3Exercicio2 {

	//2. Criar um programa informa se o ano atual é um ano bissexto;
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0)) {
			System.out.println("Ano Bissexto!");
		}else
			System.out.println("Ano não Bissexto");

		entrada.close();
	}
}
