package S2TratamentoDeErros.S3ExcecaoPersonalizada;

@SuppressWarnings("serial")
public class S3NumeroNegativoException extends RuntimeException{

	private String nomeDoAtributo;
	
	public S3NumeroNegativoException(String nomeDoAtributo) {
		
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format(" Atributo %s está negativo  ",nomeDoAtributo);
	}

}
