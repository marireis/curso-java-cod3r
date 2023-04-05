package P1Lambdas;

@FunctionalInterface //comunicando que é uma interface funcional - só pode ter 1 método abstrato
public interface Calculo {
	
	
	public abstract double exceutar(double a, double b);

	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}

}
