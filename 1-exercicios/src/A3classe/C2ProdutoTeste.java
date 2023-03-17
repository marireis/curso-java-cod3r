package A3classe;

public class C2ProdutoTeste {
	public static void main(String[] args) {
		
		
		C1Produto p1 = new C1Produto("João", 4625.89);	
		
		var p2 = new C1Produto();
		p2.nome = "Mesa";
		p2.preco = 3625.89;
		
		C1Produto.desconto = 0.50;//desconto é stativo , por isso pega todos os produtos, acessa a partir da classe
		

		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDescontoGerente(0.1);
		
		System.out.println("Media:R$" + (precoFinal1+ precoFinal2)/2);
	}

}
