package controler;

import java.util.Scanner;

public class C5DesafioDiasDaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da Semana");
		String dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia) || "Domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}else if("segunda".equalsIgnoreCase(dia) || "Segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}else if("terca".equalsIgnoreCase(dia) || "Terca".equalsIgnoreCase(dia)) {
			System.out.println(3);
		}else if("quarta".equalsIgnoreCase(dia) || "Quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}else if("quinta".equalsIgnoreCase(dia) || "Quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		}else if("sexta".equalsIgnoreCase(dia) || "Sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}else if("sabado".equalsIgnoreCase(dia) || "Sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}else {
			System.out.println("Dia inválido!");
		}
		entrada.close();
	}

}
