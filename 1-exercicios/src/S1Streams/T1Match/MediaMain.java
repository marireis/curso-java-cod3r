package S1Streams.T1Match;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class MediaMain {

	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(8).adicionar(7.5);
		Media m2 = new Media().adicionar(5).adicionar(7.5);;
	
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());

		System.out.println(Media.combinar(m1, m2).getValor());
	}
}
