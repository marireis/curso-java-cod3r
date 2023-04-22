package S2TratamentoDeErros.S3ExcecaoPersonalizada;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("", -7);
			
			Validar.aluno(aluno);
		} catch ( S3StringVaziaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM 1:D");
		
		
		
		try {
			Aluno aluno2 = new Aluno("Maria", -7);
			
			Validar.aluno(aluno2);
		} catch ( S3StringVaziaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}catch(S3NumeroNegativoException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM 2:D");
		
		

		try {
			Aluno aluno2 = new Aluno("Maria", -7);
			
			Validar.aluno(aluno2);
		} catch ( S3StringVaziaException  | S3NumeroNegativoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		
		System.out.println("FIM 3:D");
		}
		

	}
}
