package P1Lambdas;

public class CalculoTest1 {
	public static void main(String[] args) {
		
		Calculo soma = new Soma();
		System.out.println(soma.exceutar(2, 3));
		
		Calculo multiplicacao = new Multiplicacao();
		System.out.println(multiplicacao.exceutar(2, 3));
		
	}

}
