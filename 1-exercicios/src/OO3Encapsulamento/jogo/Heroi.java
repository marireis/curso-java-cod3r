package OO3Encapsulamento.jogo;

public class Heroi extends Jogador {
	
	public Heroi(){
		super();
	}
	@Override
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
		
	}
}
