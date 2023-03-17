package fundamentos;

import java.util.Scanner;

//Criar um programa que resolve equações do segundo grau 
//(ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
//Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

public class H6Exercicio6 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a = 1;
		int b = 12;
		int c = -13;

		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		
		double delta = a * (num * num) + b * num + c;
		
		System.out.println(delta);
		
		
		
	}

}
