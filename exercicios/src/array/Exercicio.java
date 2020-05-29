package array;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunosA = new double[4];
		System.out.println(Arrays.toString(notasAlunosA));

		notasAlunosA[0] = 7.9;
		notasAlunosA[1] = 8;
		notasAlunosA[2] = 6.7;
		notasAlunosA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunosA));
		System.out.println(notasAlunosA[0]);
		System.out.println(notasAlunosA[notasAlunosA.length - 1]);
		
		double totalAlunosA = 0;
		for (int i = 0; i < notasAlunosA.length; i++) {
			totalAlunosA += notasAlunosA[i];
		}
		
		System.out.println(totalAlunosA / notasAlunosA.length);
		
		final double notaArmazenada = 5.9;
		double[] notasAlunosB = { 6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunosB = 0;
		for (int i = 0; i < notasAlunosB.length; i++) {
			totalAlunosB += notasAlunosB[i];
		}
		
		System.out.println(totalAlunosB / notasAlunosB.length);
	}

}
