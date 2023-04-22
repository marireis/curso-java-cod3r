package S2TratamentoDeErros;

public class S1Basico {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			//OU
			System.out.println("Ocorreu o erro: " + e.getMessage());
			}
		
		System.out.println("FIM");
	}

}
