package OO1Composicao.C4Desafio;

public class Item {
	
	final int quantidade;
	final Produto produto;//1 item aponta para 1 produto
	
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	

}
