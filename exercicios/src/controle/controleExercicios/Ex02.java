package controle.controleExercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//Criar um programa para saber se o ano informado é bissexto
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um ano: ");
		int anoAtual = entrada.nextInt();
		
		if(anoAtual % 4 == 0) {
			System.out.println("O ano é bissexto!");
		} else {
			System.out.println("O ano NÃO é bissexto!");
		}
		
		entrada.close();
	}

}
