package OO2Heranca.DesafioCarro;

public class Ferrari extends Carro{
	
	Ferrari(){
		super(300);
	}
	

	@Override//valida o que está sobrescrevendo o metodo
	public void acelerar() {
		velocidadeAtual +=15;

	}
}
