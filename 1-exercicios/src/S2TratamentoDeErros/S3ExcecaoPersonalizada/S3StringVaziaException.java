package S2TratamentoDeErros.S3ExcecaoPersonalizada;

@SuppressWarnings("serial")
public class S3StringVaziaException extends RuntimeException{

	private String nomeDoAtributo;
	
	public S3StringVaziaException(String nomeDoAtributo) {
		
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format(" Atributo %s está vazio  ",nomeDoAtributo);
	}

}
