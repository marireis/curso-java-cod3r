package OO5Abstrato;

public class Program {

	public static void main(String[] args) {
		
		Animal a = new Cachorro();
		System.out.println(a.mover());
		
		Mamifero m = new Cachorro();
		
		System.out.println(m.mover());
		System.out.println(m.mamar());
		System.out.println(m.respirar());
		
		
	}
}
