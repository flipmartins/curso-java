package controle.controleExercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//Criar um programa que receba um número e verifique se ele está entre 0 e 10 e se é par;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10 && numero % 2 == 0) {
			System.out.println("O " + numero +  " número está entre 0 e 10 e é par");
		}
		
		entrada.close();

	}

}
