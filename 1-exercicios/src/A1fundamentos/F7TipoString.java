package A1fundamentos;

public class F7TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
	String s = "Boa tarde";
	System.out.println(s.concat("!!!!"));
	System.out.println(s + "!!!!");
	System.out.println(s.startsWith("Boa"));
	System.out.println(s.endsWith("tarde"));
	System.out.println(s.toLowerCase().startsWith("boa"));
	System.out.println(s.length());
	System.out.println(s.toLowerCase().equals("boa tarde"));
	System.out.println(s.equalsIgnoreCase("boa tarde"));
	
	var nome = "Pedro";
	var sobrenome = "Santos";
	var idade = 33;
	var salario = 12345.23;
	
	System.out.println("Nome: " + nome + " \nSobrenome: "+ sobrenome + "\nIdade: " + idade);
	System.out.printf("O senhor %s %s tem %d e ganha %.2f.\n", nome , sobrenome, idade, salario );
	String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome,sobrenome,idade,salario);
	System.out.println(frase);
	
	System.out.println("Frase Qualquer".contains("qual"));
	System.out.println("Frase Qualquer".indexOf("qual"));
	System.out.println("Frase Qualquer".substring(6));
	System.out.println("Frase Qualquer".substring(6,10));
	

	}
}
