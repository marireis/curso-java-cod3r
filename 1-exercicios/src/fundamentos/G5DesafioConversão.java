package fundamentos;

import java.util.Scanner;

public class G5DesafioConversão {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário: ");
		String s1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o segundo salário ");
		String s2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o terceiro salário: ");
		String s3 = entrada.next().replace(",", ".");
		
		
		double salario1 = Double.parseDouble(s1);
		double salario2 = Double.parseDouble(s2);
		double salario3 = Double.parseDouble(s3);
		
		double mediaSalario = (salario1 + salario2 + salario3)/3;
		
		System.out.printf("A média do salário é: %.2f ", mediaSalario);
		
		entrada.close();
	}
}
