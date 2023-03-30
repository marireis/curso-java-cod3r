package OO3Encapsulamento.pessoaGetSet;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jose","Reis",-45);
		
		p1.setIdade(230);
		
		System.out.println(p1.getIdade());
		System.out.println(p1);//toString
		System.out.println(p1.nomeCompleto());
	}
	
}