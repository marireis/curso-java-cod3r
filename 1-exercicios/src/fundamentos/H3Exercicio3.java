package fundamentos;

import java.util.Locale;
import java.util.Scanner;

//Criar um programa que leia o peso e a altura 
//do usuário e imprima no console o IMC.
public class H3Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Locale.setDefault(Locale.US);
		
		System.out.println("Seu Peso: ");
		double peso = entrada.nextDouble();
		System.out.println("Sua Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / ( altura * altura );
		
		System.out.print("Resultado:" + imc);
		entrada.close();
	}
}
