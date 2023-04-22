package S2TratamentoDeErros;

import java.util.Scanner;

public class S5Finally {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println( 7/ sc.nextInt());//aritimetico erro
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("Finally...");
			sc.close();
		}
		System.out.println("FIM");
		
		
		try {
			System.out.println( 7/ sc.nextInt());//aritimetico erro
			
		}finally {
			System.out.println("Finally #2...");
			sc.close();
		}
		System.out.println("FIM");
		
		
		
		
	}
}
