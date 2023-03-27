package OO2Heranca.C1Jogador;

public class Heroi extends Jogador {
	
	Heroi(){
		super();
	}

	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
		
	}
}
