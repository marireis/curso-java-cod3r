package A3classe;

public class C6Equals {
	public static void main(String[] args) {
		
	C7UsuarioE u1 = new C7UsuarioE();
	u1.nome = "Pedro Jr";
	u1.email = "pp@emial.com";
	
	C7UsuarioE u2 = new C7UsuarioE();
	u2.nome = "Pedro Jr";
	u2.email = "pp@emial.com";
	
	System.out.println(u1 == u2);
	System.out.println(u1.equals(u2));
	System.out.println(u2.equals(u1));
	
	System.out.println("===================");
	
	System.out.println(u1.equals2(u2));
	System.out.println(u2.equals2(u1));

	
	}

}
