package A6Composicao.C2compra;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra c = new Compra();
		c.cliente = "Maria";
		
//		c.itens.add(new Item("caneta", 20, 7.45));
//		c.itens.add(new Item("borracha", 10, 4.45));
		
		c.adicionarItem(new Item("caneta", 20, 7.45));
		c.adicionarItem(new Item("borracha", 10, 4.45));
		
		System.out.println(c.itens.size());
		
		System.out.println(c.valorTotal());
		
		System.out.println(c.itens.get(0).compra.itens.get(1).compra.valorTotal());
	}

}
