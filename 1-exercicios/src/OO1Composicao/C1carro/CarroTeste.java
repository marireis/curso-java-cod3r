package OO1Composicao.C1carro;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c = new Carro();
		
		System.out.println(c.estaLigado());
		
		c.ligar();
		
		System.out.println(c.estaLigado());
		
		System.out.println(c.motor.giro());
		
		c.acelerar();
		c.acelerar();
		
		System.out.println(c.motor.giro());
		
		c.frear();
		c.frear();
		
		System.out.println(c.motor.giro());
		
		//relacionamento bidirecional
		System.out.println(c.motor.carro.estaLigado());
		
		//ENCAPSULAMENTO
		//c.motor.fatorInjecao = -30;
		
	}

}
