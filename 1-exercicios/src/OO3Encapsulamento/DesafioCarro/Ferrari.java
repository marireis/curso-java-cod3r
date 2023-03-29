package OO3Encapsulamento.DesafioCarro;

public class Ferrari extends Carro{
	
	public Ferrari(){
		this(300);
	}
	
	public Ferrari(int velocidadeMax){
		super(velocidadeMax);
	}

	@Override//valida o que está sobrescrevendo o metodo
	public void acelerar() {
		velocidadeAtual +=15;

	}
}
