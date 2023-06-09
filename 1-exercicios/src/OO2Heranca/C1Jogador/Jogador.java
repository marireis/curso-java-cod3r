package OO2Heranca.C1Jogador;

public class Jogador {
	
	int x;
	int y;
	int vida = 100;
	
	Jogador(){
		this(0,0);
	}
	
	Jogador(int x, int y){//contrutor explícito, -gera o .class
		this.x = x;
		this.y = y;
	}
	

	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x- oponente.x);
		int deltaY = Math.abs(y- oponente.y);
		
		if(deltaX == 0 && deltaY ==1) {
			oponente.vida -=20;
			return true;
		}else if(deltaX ==1 && deltaY == 0) {
			oponente.vida -=10;
			return true;
		}
		return false;
	}
	
	boolean andar(Direcao direcao) {
		if(direcao == Direcao.NORTE) {
			y++;
		}
		return true;
	}
	
	boolean andar2(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}
}
