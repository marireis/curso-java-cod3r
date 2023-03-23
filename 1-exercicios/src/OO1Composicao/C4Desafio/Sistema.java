package OO1Composicao.C4Desafio;

public class Sistema {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Maria");
		
		Compra compra1 = new Compra();
		
		compra1.adcItem("caneta", 5.2, 100);
		compra1.adcItem(new Produto(2215.20, "computador"), 2);
		compra1.adcItem("mouse", 50.5, 10);
		
		
		Compra compra2 = new Compra();
		
		compra2.adcItem("borracha", 2.2, 40);
		compra2.adcItem(new Produto(2154.20, "notebook"), 3);
		compra2.adcItem("teclado", 30.5, 20);
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
		cliente.adcCompra(compra2);//acessando o método dentro de cliente
		
		
		
	}

}
