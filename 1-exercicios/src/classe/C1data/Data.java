package classe.C1data;

public class Data {
	public int dia; 
	public int mes;
	public int ano;

	Data(){
		dia =1;
		mes = 1;
		ano=1970;
		
		//ou
		//this(1,1,1945); chamar o construtor
		}
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	//metodo mais interessante com retorno- pode ser usado em api desktop, web, mobile
	public String obterDataFormatada(){
		
		String formato = "%d/%d/%d";
		return(String.format(formato,dia,mes,ano));
		
	}
	
	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d\n",dia,mes,ano);
	}
	
	void imprimirData() {
		System.out.printf(obterDataFormatada());
	}
}
