package S2TratamentoDeErros.S4ExcecaoPersonalizadaB;

@SuppressWarnings("serial")
public class S3NumeroNegativoException extends Exception{//exceção checada

	private String nomeDoAtributo;
	
	public S3NumeroNegativoException(String nomeDoAtributo) {
		
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format(" Atributo %s está negativo  ",nomeDoAtributo);
	}

}
