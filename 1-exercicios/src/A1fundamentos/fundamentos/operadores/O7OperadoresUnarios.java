package A1fundamentos.fundamentos.operadores;

public class O7OperadoresUnarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		//forma pós fixada
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		//forma pré fixada
		++b;
		System.out.println(b);
		--b;
		System.out.println(b);
		
		System.out.println(a == b);
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);
	}

}
