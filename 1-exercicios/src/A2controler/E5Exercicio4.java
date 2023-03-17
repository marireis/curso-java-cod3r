package A2controler;

import java.util.Scanner;

public class E5Exercicio4 {
	//4. Criar um programa que receba um número e diga se ele é um número primo.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Número:");
		double numero = entrada.nextDouble();
		
		int contadorDeDivisores=0;
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}
		entrada.close();
	}

}
