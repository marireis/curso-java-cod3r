package OO2Heranca.DesafioCarro;

public class Carro {
	int velocidadeAtual;
	
	public void acelerar() {
		velocidadeAtual+=5;
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
