package OO2Heranca.C1Jogador;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador j1 = new Jogador();
		j1.x=10;
		j1.y=10;
		
		Jogador j2 = new Jogador();
		j2.x=10;
		j2.y=11;
		
		j1.atacar(j2);
		
		System.out.println(j1.vida);
		
		j2.atacar(j1);
		
		System.out.println(j2.vida);
		
//		j1.andar2(Direcao.NORTE);
//		j1.andar2(Direcao.LESTE);
//		j1.andar2(Direcao.NORTE);
//		j1.andar2(Direcao.LESTE);
//		
//		System.out.println(j1.x);
//		System.out.println(j1.y);
		
		
		Heroi heroi = new Heroi();//heroi extend jogador
		heroi.x=10;
		heroi.y=10;
		
		Monstro monstro = new Monstro(10,11);
		monstro.x=10;
		monstro.y=11;
		
		System.out.println("O Heroi tem: " +heroi.vida);
		System.out.println("O monstro tem: " +monstro.vida);
		
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		
		System.out.println("O Heroi tem: " +heroi.vida);
		System.out.println("O monstro tem: " +monstro.vida);
		
		monstro.atacar(heroi);
		
		System.out.println("O monstro tem: " +monstro.vida);
		System.out.println("O Heroi tem: " +heroi.vida);
		
		monstro.andar(Direcao.NORTE);
	}
}
