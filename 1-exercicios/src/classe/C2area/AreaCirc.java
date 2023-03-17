package classe.C2area;

public class AreaCirc {
	
	double raio;
	static final double PI= 3.1415;//PI maiusculo constante
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
		
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {//metodo statico nao precisa criar instancia nem para acessar atributo de classe e nem o método de classe
		return PI * Math.pow(raio,2);
	}

}
