package classe.C1data;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		//System.out.println("Data d1: "+d1.dia+"/"+d1.mes+"/"+d1.ano);
		
		Data d2 = new Data(02,02,1970);
		
		//metodo 1 - com return
		System.out.printf(d1.obterDataFormatada());
		System.out.printf(d2.obterDataFormatada());
		
		
		//metodo 2 - sem return
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
		//metodo 3 - sem return
		d1.imprimirData();
	}

}
