package OO3Encapsulamento.jogo;

public class Jogador {
	
	public int x;
	public int y;
	public int vida = 100;
	
	public Jogador(){
		this(0,0);
	}
	
	protected Jogador(int x, int y){//contrutor explícito, -gera o .class
		this.x = x;
		this.y = y;
	}
	

	public boolean atacar(Jogador oponente) {
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
	
	public boolean andar(Direcao direcao) {
		if(direcao == Direcao.NORTE) {
			y++;
		}
		return true;
	}
	
	public boolean andar2(Direcao direcao) {
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
