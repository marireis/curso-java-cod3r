package fundamentos;

import java.util.Scanner;

public class F9Wrapper {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//byte
		Byte b = 1;
		Short s = 1000;
		//Integer i = Integer.parseInt(entrada.next());
		Integer i = 10000;
		Long l = 1000000L;//Maiusculo vira classe
		
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l/3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 124.56;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c+"...");
		
		
		
		
	}

}
