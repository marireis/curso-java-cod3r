package A5collections;

import java.util.Objects;

public class C3Usuario {
	
	String nome;
	
	public C3Usuario(String nome) {
		this.nome = nome;
	}
	
	

	@Override
	public String toString() {
		return "[nome=" + nome + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		C3Usuario other = (C3Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	

}
