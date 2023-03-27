package OO2Heranca.DesafioCarro;

public class Ferrari extends Carro{

	@Override//valida o que está sobrescrevendo o metodo
	public void acelerar() {
		velocidadeAtual +=15;

	}
}
