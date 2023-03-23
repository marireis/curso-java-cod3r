package OO1Composicao.C4Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item>itens = new ArrayList<>();
	
	void adcItem(Produto p, int qtde) {
		this.itens.add(new Item(p,qtde));
	}
	
	void adcItem(String nome, double preco, int qtde) {
		var produto  = new Produto(preco, nome);
		this.itens.add(new Item(produto,qtde));
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
	
	
}
