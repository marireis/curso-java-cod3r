package OO1Composicao.C1carro;

public class Carro {
	
	//Motor motor = new Motor();
	
	Motor motor;
	//para relacionamento bidirecional
	Carro(){
		this.motor = new Motor();
	}
	
	void acelerar() {
		if(motor.fatorInjecao < 0.3) {
			motor.fatorInjecao += 2.6;			
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;			
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	

}
