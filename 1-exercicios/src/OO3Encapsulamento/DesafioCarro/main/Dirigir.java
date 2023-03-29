package OO3Encapsulamento.DesafioCarro.main;

import OO3Encapsulamento.DesafioCarro.Carro;
import OO3Encapsulamento.DesafioCarro.Celta;
import OO3Encapsulamento.DesafioCarro.Ferrari;

public class Dirigir {

	public static void main(String[] args) {
		
		Carro ce = new Celta();
		
		Carro fe = new Ferrari();
		Carro fe2 = new Ferrari(400);
		
		
		ce.acelerar();
		ce.acelerar();
		ce.acelerar();
		System.out.println(ce);
		ce.frear();
		System.out.println(ce);
		
		fe.acelerar();
		fe.acelerar();
		fe.acelerar();
		System.out.println(fe);
		fe.frear();
		System.out.println(fe);
		
	}
}
