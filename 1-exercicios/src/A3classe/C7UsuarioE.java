package A3classe;

public class C7UsuarioE {
	
	String nome;
	String email;
	
	public boolean equals(Object obj) {
			
			C7UsuarioE outro = (C7UsuarioE) obj; //converte o objeto em usuario
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		}
		

	
	public boolean equals2(Object obj) {
		
		if(obj instanceof C7UsuarioE) {
			
			C7UsuarioE outro = (C7UsuarioE) obj; //converte o objeto em usuario
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		}else {
			return false;
		}
		
	}
	
	public int hashCode() {
		return this.nome.length(); //return 0;
	}
}

