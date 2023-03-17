package A1fundamentos;

public class G3ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;//usando wrapper
		System.out.println(num1.toString().length());
		
		int num2 = 100000;//usanod tipo primitivo
		
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		
	}

}
