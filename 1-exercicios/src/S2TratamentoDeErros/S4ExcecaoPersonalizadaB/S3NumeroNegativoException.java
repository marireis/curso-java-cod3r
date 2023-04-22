package S2TratamentoDeErros.S4ExcecaoPersonalizadaB;

@SuppressWarnings("serial")
public class S3NumeroNegativoException extends Exception{//exce��o checada

	private String nomeDoAtributo;
	
	public S3NumeroNegativoException(String nomeDoAtributo) {
		
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format(" Atributo %s est� negativo  ",nomeDoAtributo);
	}

}
