package S2TratamentoDeErros.S4ExcecaoPersonalizadaB;

@SuppressWarnings("serial")
public class S3StringVaziaException extends Exception{

	private String nomeDoAtributo;
	
	public S3StringVaziaException(String nomeDoAtributo) {
		
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format(" Atributo %s está vazio  ",nomeDoAtributo);
	}

}
