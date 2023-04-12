package P1Lambdas.L6supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		Supplier<List<String>> umList = () -> Arrays.asList("Ana", "Teo", "Gui");
		
		System.out.println(umList.get());
		
		//tipo de interface funcional que nao retorna parametro
	}
}
