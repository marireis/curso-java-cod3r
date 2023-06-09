package S2TratamentoDeErros.S6Causa;

public class S6Causa {
	
	public static void main(String[] args) {
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
		metodoA(null);
		
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException(e);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
		throw new NullPointerException("Aluno est� nulo ");
		}
		System.out.println(aluno.nome);
	}

}
