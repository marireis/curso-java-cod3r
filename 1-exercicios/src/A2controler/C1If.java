package A2controler;

import java.util.Scanner;

public class C1If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();

		if(media<=10.0 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabens!");
		}
		if(media<7.0 && media >=5.0) {
			System.out.println("Recuperação");
		}
		
		boolean criterioReprovação = media<5.0 && media>=0;
		
		if(criterioReprovação) {
			System.out.println("Reprovado");
		}
		entrada.close();
		
	}

}
