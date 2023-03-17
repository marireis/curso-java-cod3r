package A3classe;

public class C1Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;

	//construtor padrao explicito
	C1Produto(){}

	//construtor explícito
	C1Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	
	double precoComDesconto() {
		
		return (preco * (1 - desconto));
	}
	
	double precoComDescontoGerente(double descontoGerente) {
		
		return (preco * (1 - desconto + descontoGerente));
	}
	
}
