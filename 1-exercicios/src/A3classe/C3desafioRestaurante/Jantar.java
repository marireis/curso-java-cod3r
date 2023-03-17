package A3classe.C3desafioRestaurante;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("feijão", 0.300);
		Pessoa p = new Pessoa("Joao", 80);
		
		System.out.println(p.apresentar());
		p.comer(c);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
	}

}
