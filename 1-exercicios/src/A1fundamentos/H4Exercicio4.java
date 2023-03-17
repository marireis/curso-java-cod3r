package A1fundamentos;

import java.util.Scanner;


//Criar um programa que leia um valor e apresente os resultados
//ao quadrado e ao cubo do valor.

public class H4Exercicio4 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor = entrada.nextInt();
		
		valor = (int) Math.pow(valor, 2);
		
		System.out.println(valor);
		
		valor = (int) Math.pow(valor, 3);
		
		System.out.println(valor);
		
		entrada.close();
	}
	
	
	
	

}
