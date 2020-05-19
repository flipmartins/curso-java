package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		var nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		var sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		var idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		entrada.close();
	}

}
