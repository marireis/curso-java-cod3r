package A1fundamentos.fundamentos.operadores;

public class O4DesafioLogico {
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaude = !comprouSorvete;
		
		System.out.println("Compra Tv de 50\"?" + comprouTv50);
		System.out.println("Compra Tv de 32\"?" + comprouTv32);
		System.out.println("Compra Sorvete\"?" + comprouSorvete);
		
		System.out.println("Mais saudável: " + maisSaude);

		
	}

}
