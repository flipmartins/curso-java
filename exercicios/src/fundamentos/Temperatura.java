package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		// (F - 32) * 5 / 9 = C
		final int FAHRENHEIT = 32;
		final double FORMULA = (5.0 / 9.0);
		int temperaturaEmF = 0;
		//double temperaturaEmC = 0;
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		Scanner sc = new Scanner(System.in);
		temperaturaEmF = sc.nextInt();
		double result = (temperaturaEmF - FAHRENHEIT) * (FORMULA);
		
		System.out.printf("%.2f", result);
		
		sc.close();
	}

}
