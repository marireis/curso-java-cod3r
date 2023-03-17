package A3classe.C2area;

public class AreaTeste {

	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(5.6);
		
		//a.pi = 10000000;
		
		System.out.println(a.area());
		
		AreaCirc a2 = new AreaCirc(5);
		//a.pi = 10000000;
		
		System.out.println(a2.area());
		
		
		
		System.out.println(a.area());
		
		System.out.println(AreaCirc.PI);
		
		System.out.println(Math.PI);
		
		
		
	}
}
