package A1fundamentos.fundamentos.operadores;

public class O1OperadoresLogico {
	public static void main(String[] args) {
		
		boolean cond1 = true;
		boolean cond2 = 3>7;
		
		System.out.println(cond1 && cond2);
		System.out.println(cond1 && !cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2);
		System.out.println(!!cond1);
		System.out.println(!cond2);
		
		//tabela verdade E
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//tabela verdade OU
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//tabela verdade NOT
		System.out.println(!true);
		System.out.println(!false);

	}

}
