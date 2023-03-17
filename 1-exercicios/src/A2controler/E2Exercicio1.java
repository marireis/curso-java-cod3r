package A2controler;

import java.util.Scanner;

public class E2Exercicio1 {

	//1. Criar um programa que receba 
	//um número e verifique se ele está 
	//entre 0 e 10 e é par;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();
		
		if(numero>= 0 && numero<=10) {
			if(numero %2 == 0) {
				System.out.println("Número está entre 0 e 10, número é par");
			}else
				System.out.println("Número está entre 0 e 10, mas não é par");
		}else
			System.out.println("Número não está entra 0 e 10");

		entrada.close();
	}
}
