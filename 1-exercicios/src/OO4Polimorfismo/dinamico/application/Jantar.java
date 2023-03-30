package OO4Polimorfismo.dinamico.application;

import OO4Polimorfismo.dinamico.entities.Arroz;
import OO4Polimorfismo.dinamico.entities.Feijão;
import OO4Polimorfismo.dinamico.entities.Pessoa;
import OO4Polimorfismo.dinamico.entities.Sorvete;

public class Jantar {

	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.200);
		Feijão ingrediente2 = new Feijão(0.100);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
		
	}
}
