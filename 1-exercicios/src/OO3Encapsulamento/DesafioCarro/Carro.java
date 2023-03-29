package OO3Encapsulamento.DesafioCarro;

public class Carro {
	int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	
	protected Carro(int velocidadeMax){
		VELOCIDADE_MAXIMA = velocidadeMax;
	}
	
	public void acelerar() {
		if(velocidadeAtual + 5 >  VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			
			velocidadeAtual+=5;
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
}
