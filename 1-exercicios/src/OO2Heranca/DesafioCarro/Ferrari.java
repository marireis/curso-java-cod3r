package OO2Heranca.DesafioCarro;

public class Ferrari extends Carro{
	
	Ferrari(){
		this(300);
	}
	
	Ferrari(int velocidadeMax){
		super(velocidadeMax);
	}

	@Override//valida o que está sobrescrevendo o metodo
	public void acelerar() {
		velocidadeAtual +=15;

	}
}
