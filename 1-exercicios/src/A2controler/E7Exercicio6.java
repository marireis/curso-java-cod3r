package A2controler;

import java.util.Scanner;

public class E7Exercicio6 {
	/**  Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
	 * Armazene um numero aleatório em uma variável. 
	 * O Jogador tem 10 tentativas para adivinhar o número gerado. 
	 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
	 * e imprima se o número inserido é maior ou menor do que o número armazenado. */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num = 15;
		int cont = 9;
		int numero;
		
		do{
			System.out.println("\nDigite um Número (0 - 100):");
			numero = entrada.nextInt();
			
			if(numero == num) {
				System.out.printf("VOCÊ ACERTOU O NÚMERO É %d ", num);
				break;
			}else {
				System.out.printf("Você errou, tente novamente, você ainda possui %d tentativas :\n", cont);
				cont--;					
				}
			if(cont ==9) {
				System.out.printf("Você não possui mais chances, o número era: %d", num);
			}
			
		}while(cont<10);
		
		entrada.close();
			
	}
}
		
		

