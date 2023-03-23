package OO2Heranca.C1Jogador;

public class Jogo {

	Jogador carro;//relacionamento bidirecional
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giro() {
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
