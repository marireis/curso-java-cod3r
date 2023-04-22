package S2TratamentoDeErros;

public class S2ChecadaXNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			gerarErro1();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			gerarErro2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
		
		
		gerarErro1();//RunTime nao tem obriga��o de tratar o erro - n�o checadas
	}
	//exce��o n�o checada ou n�o verificada
	static void gerarErro1() {
		throw new RuntimeException("Erro #1");
	}
	
	static void gerarErro2() throws Exception {//precisa deixar claro quando a exce��o � checada - colocar na assinatura do m�todo o throws
	//exce��o checada
	throw new Exception("Erro #2");
		
	}

}
