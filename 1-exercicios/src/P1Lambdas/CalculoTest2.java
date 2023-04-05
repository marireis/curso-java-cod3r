package P1Lambdas;

public class CalculoTest2 {
	public static void main(String[] args) {
		
		Calculo soma = (x, y) -> {return  x+ y; };
		System.out.println(soma.exceutar(2, 3));
		
		soma = (x, y) -> x * y;
		System.out.println(soma.exceutar(2, 3));
		System.out.println(soma.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
