package A2controler;

import javax.swing.JOptionPane;

public class C3IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		int numero = Integer.parseInt(valor);
		
		if(numero%2 == 0) {
			System.out.println("Número Par");
		}
		else
			System.out.println("Número Impar");
	}

}
