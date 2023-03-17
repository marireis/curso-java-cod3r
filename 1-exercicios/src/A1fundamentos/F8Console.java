package A1fundamentos;

import java.util.Scanner;

public class F8Console {
	public static void main(String[] args) {
		
		System.out.print("Bom ");
		System.out.print("dia \n");
		
		System.out.println(" Boa");
		System.out.println(" Tarde");
		
		System.out.printf("Megasena: %d %d %d %n", 1,2,3);
		
		System.out.printf("Salario: %.1f %n",1243.456);
		
		System.out.printf("Nome: %s%n","João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrennome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",nome,sobrenome,idade);
	}

}
