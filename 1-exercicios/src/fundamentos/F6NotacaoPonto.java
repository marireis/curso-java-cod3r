package fundamentos;

public class F6NotacaoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X","Gui")
				.toUpperCase()
				.concat("!!!!");
		
		System.out.println(y);
		
		//tipo primitivos não tem o operador .
		int c = 3;
		System.out.println(c);
	}

}
