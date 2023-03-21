package A6Composicao.C1carro;

public class Motor {

	Carro carro;//relacionamento bidirecional
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
