package A1fundamentos;

public class F5TiposPrimitivos {
	public static void main(String[] args) {
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 127;
		short numeroDeVoos = 32767;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		long pontos = 2_134_845_223;
		
		//tipos numéricos reais
		float salario = 893.23F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false;
		
		//tipo caractere
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		System.out.println(id + " ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: "+ status);
		
		
		//
	}

}
