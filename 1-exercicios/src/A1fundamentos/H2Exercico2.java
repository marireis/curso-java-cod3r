package A1fundamentos;

import java.util.Scanner;

//Criar um programa que leia a temperatura em 
//Celsius e converta para Fahrenheit.

public class H2Exercico2 {
	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double tempC = entrada.nextDouble();
		
		double tempF = (tempC * 9/5) + 32;
		
		System.out.printf("Resultado: %.2f", tempF);
		entrada.close();
	}

}
