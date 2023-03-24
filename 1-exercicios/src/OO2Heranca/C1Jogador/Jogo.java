package OO2Heranca.C1Jogador;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador j1 = new Jogador();
		j1.x=10;
		j1.y=10;
		
		Jogador j2 = new Jogador();
		j2.x=10;
		j2.y=11;
		
//		j1.andar2(Direcao.NORTE);
//		j1.andar2(Direcao.LESTE);
//		j1.andar2(Direcao.NORTE);
//		j1.andar2(Direcao.LESTE);
//		
//		System.out.println(j1.x);
//		System.out.println(j1.y);
		
		j1.atacar(j2);
		
		System.out.println(j1.vida);
		
		j2.atacar(j1);
		
		System.out.println(j2.vida);
		
		
	}
}
