package A4Arrays;

import java.util.Arrays;

public class B1Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3]; //ou double[] notasAlunosA = new double[3]; ou double notasAlunosA[] = new double[3]
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(notasAlunoA[notasAlunoA.length-1]);//ultimo índice do array
		
		System.out.println(Arrays.toString(notasAlunoA));
	
	//Array 1
		double totalAlunoA =0;
		for(int i =0; i< notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
			
			System.out.println(notasAlunoA[i]);
		}
		
		System.out.println(totalAlunoA/notasAlunoA.length);
		//Array 2
		
		double notaArmazenada = 8.8;
		double[] notasAlunoB = {6.9, 8.8, 7.5, notaArmazenada };
		double totalAlunoB = 0;
		for(int i = 0; i< notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB/notasAlunoB.length);
	}
}
