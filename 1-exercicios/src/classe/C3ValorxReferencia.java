package classe;

import classe.C1data.Data;

public class C3ValorxReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;//atribuição por valor (Tipo Primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1,6,2022);
		
		Data d2 = d1; //atribuição por referência (Objeto)
		
		d1.dia = 31;
		d1.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarData(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}
	
	static void voltarData(Data d) {
		d.dia = 1;
		d.mes = 2;
		d.ano = 2022;
	}
	
	static void alterarPrimitivo(int c) {
		c++;
	}
	
	
}
