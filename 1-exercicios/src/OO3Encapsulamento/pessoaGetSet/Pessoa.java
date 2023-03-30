package OO3Encapsulamento.pessoaGetSet;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobrenome;
	
	public Pessoa(String nome,String sobrenome, int idade) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
		
	}
	//set = altera
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
    //get = ler
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String nomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	
	public String toString(){
		return "Olá eu sou o " + getNome() + " " + getSobrenome() +
		" e tenho " + getIdade() + " anos";
	}
	
	

}
