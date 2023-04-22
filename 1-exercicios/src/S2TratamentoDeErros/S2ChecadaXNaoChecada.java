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
		
		
		gerarErro1();//RunTime nao tem obrigação de tratar o erro - não checadas
	}
	//exceção não checada ou não verificada
	static void gerarErro1() {
		throw new RuntimeException("Erro #1");
	}
	
	static void gerarErro2() throws Exception {//precisa deixar claro quando a exceção é checada - colocar na assinatura do método o throws
	//exceção checada
	throw new Exception("Erro #2");
		
	}

}
