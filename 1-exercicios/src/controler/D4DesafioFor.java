package controler;

public class D4DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i<=5; i++) {
			System.out.println(valor);
			valor+="#";
		}
		
		String v = "#";
		for( v = "#";!v.equals("######"); v+="#" ) {
			System.out.println(v);
	
		}
	}

}
