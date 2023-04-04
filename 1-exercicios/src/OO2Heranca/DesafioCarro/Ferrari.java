package OO2Heranca.DesafioCarro;

public class Ferrari extends Carro implements Esportivo{
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	Ferrari(){
		this(300);
	}
	
	Ferrari(int velocidadeMax){
		super(velocidadeMax);
		setDelta(15);
	}

	@Override//valida o que está sobrescrevendo o metodo
	public void acelerar() {
		velocidadeAtual +=15;
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		
	}
	
	public void ligarAr() {
		ligarAr = true;
	}
	
	public void desligarAr() {
		ligarAr = false;
	}
	
	public int getDelta() {
		
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr){
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else{
			return 15;
		}
	}
}
