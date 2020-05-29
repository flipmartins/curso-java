package controle.controleExercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//Criar um programa que receba um número e diga se ele é um número primo.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = entrada.nextInt();
		boolean ehPrimo = true;
		
		for (int i = 2; i <= numero; i++) {
			if(((numero % i == 0)) && (i != numero)){
				ehPrimo = false;
				break;
			}
		}
		if(ehPrimo) {
			System.out.println("É primo");
		} else {
			System.out.println("Não é primo");
		}
		
		entrada.close();
	}

}
