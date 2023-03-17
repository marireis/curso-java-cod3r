package fundamentos.operadores;

public class O5OperadoresRelacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(3>4);
		System.out.println(3>=4);
		System.out.println(3<4);
		System.out.println(3<=4);
		System.out.println(3!=4);
		
		double nota = 7.3;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota>=7;
		boolean temDesconto = bomComportamento&&passouPorMedia;
		
		System.out.println("Tem desconto: "+ temDesconto);

	}

}
