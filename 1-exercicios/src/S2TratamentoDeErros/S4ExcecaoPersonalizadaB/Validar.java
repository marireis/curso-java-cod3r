package S2TratamentoDeErros.S4ExcecaoPersonalizadaB;

public class Validar {
	
	private Validar() {
		
	}
	
	public static void aluno(Aluno aluno) 
			throws S3NumeroNegativoException, S3StringVaziaException{
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo");//exceção do java
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new S3StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new S3NumeroNegativoException("nota");
		}
	}

}
