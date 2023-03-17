package A2controler;

import java.util.Scanner;

public class E8Exercicio7 {
	/**  7. Criar um programa que enquanto estiver recebendo números positivos, 
	 * imprime no console a soma dos números inseridos, caso receba um número negativo, 
	 * encerre o programa. Tente utilizar a estrutura do while. */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int cont = 0;
		int numero =0;
		
		while(numero >= 0){
			
			System.out.println("\nDigite um Número positivo - (para sair digitar número negativo) - :");
			numero = entrada.nextInt();
			
			cont += numero;		
		}
		System.out.printf("Soma dos números digitados %d ", cont);
		
		entrada.close();
			
	}
}
		
		

