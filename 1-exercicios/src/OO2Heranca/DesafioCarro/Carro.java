package OO2Heranca.DesafioCarro;

public class Carro {
	int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta = 5;
	
	Carro(int velocidadeMax){
		VELOCIDADE_MAXIMA = velocidadeMax;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() >  VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			
			velocidadeAtual+=getDelta();
		}
	}

	public void frear() {
		if(velocidadeAtual>=5) {
			velocidadeAtual-=5;
		}else {
			velocidadeAtual=0;
		}
	}
	
	public String toString() {
		return "Velocidade Atual é: " + velocidadeAtual + " KM/h.";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
