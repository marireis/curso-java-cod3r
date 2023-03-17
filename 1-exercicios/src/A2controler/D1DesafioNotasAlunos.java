package A2controler;

import java.util.Scanner;

public class D1DesafioNotasAlunos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cont=0;
		double total =0;
		double nota = 0;
		double media = 0;
		
		while(nota != -1) {
			
			System.out.println("Digite uma nota ou -1 para sair: ");
			nota = entrada.nextDouble();
			
			if(nota<=10 || nota>=0) {
				cont++;
				total += nota;
			}else if(nota != -1){
				System.out.println("Nota Inválida");
			}
		}
		media = total/cont;	
		System.out.printf("Quantidade de notas válidas: %d\n", cont);
		System.out.printf("Somatório de notas válidas: %.2f\n", total);
		System.out.printf("Media: %.2f \n",media);

		entrada.close();
	}

}
