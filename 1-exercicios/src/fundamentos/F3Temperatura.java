package fundamentos;

public class F3Temperatura {
	
	public static void main(String[] args) {
		//(ºF - 32) X 5/9 = ºC
		
		int fahrenheit = 86;
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double tempCelsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("Temperatura em Celsius: " + tempCelsius);
		
		fahrenheit = 150;
		tempCelsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("Temperatura em Celsius: " + tempCelsius);
	}

}
