package A1fundamentos.fundamentos.operadores;

public class O8OperadoresTernario {
	public static void main(String[] args) {
		double media = 3;

		String resultado = media >= 7.0 ?
				"Aprovado" : "Recuperção";
		
		System.out.println("O Aluni está: " + resultado);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota>=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado2 = temDesconto ? "sim" : "não";
		System.out.println(resultado2);
		
	}

}
