package fundamentos;

import java.util.Scanner;

//Criar um programa que leia a temperatura 
//em Fahrenheit e converta para Celsius.

public class H1Exercicio1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double tempF = entrada.nextDouble();
		
		double tempC = (tempF - 32) * 5/9;
		
		System.out.printf("Resultado: %.2f", tempC);
		entrada.close();
	}

}
