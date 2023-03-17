package A1fundamentos;

import java.util.Scanner;

public class G7DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número?");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número?");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a operação (+ - * / %)");
		String op = entrada.next();
		
		double result = "+".equals(op)? num1+num2 : 0;
		result = "-".equals(op)? num1-num2 : result;
		result = "*".equals(op)? num1*num2 : result;
		result = "/".equals(op)? num1/num2 : result;
		result = "%".equals(op)? num1%num2 : result;
		
		System.out.printf("%f %s %f = %.2f ",num1,op, num2);
		
		entrada.close();
		
	}
}
