package S1Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class S6Reduce {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;//somando o acumulador
		
		Integer total1 = nums.parallelStream().reduce(soma).get();
		//ou
		Integer total2 = nums.stream().reduce(soma).get();
		
		System.out.println(total1);
		System.out.println(total2);
		
		//com valor inicial		
		Integer total3 = nums.stream().reduce(100, soma);
		System.out.println(total3);
		
		//diferente
		Integer total4 = nums.parallelStream().reduce(100, soma);
		System.out.println(total4);
		
		//Resultado foi um Opcional<Integer>
		nums.stream()
		.filter(n -> n > 5)
		.reduce(soma)
		.ifPresent(System.out::println);
	}

}
