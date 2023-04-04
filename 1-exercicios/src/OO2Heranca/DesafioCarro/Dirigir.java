package OO2Heranca.DesafioCarro;

public class Dirigir {

	public static void main(String[] args) {
		
		Carro ce = new Celta();
		
		Carro fe = new Ferrari();
		Carro fe2 = new Ferrari(400);
		Ferrari f3 = new Ferrari(300);
		
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
		
		f3.ligarTurbo();
		f3.acelerar();
		//f3.frear();
		System.out.println(f3);
	}
}
