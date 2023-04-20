package S1Streams.T2MinMax;

public class Aluno {

	String nome;
	double nota;
	boolean bomComportamento;
	
	//chama o constutor de baixo com this e passa bomCOmportamento como true;
	public Aluno(String nome, double nota) {
		this(nome, nota,true);	
	}
	
	public Aluno(String nome, double nota, boolean bomComportamento) {
		
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota=" + nota + "]";
	}
	
	
	
}
