package OO5Abstrato;

public abstract class Mamifero extends Animal {
	
	public abstract String mamar();
	
	@Override
	public String mover() {
		return "Saindo do lugar";
	}

}
