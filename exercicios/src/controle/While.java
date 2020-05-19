package controle;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		//Receber um texto e só finalizar quando for igual a "sair"
		
		Scanner entrada = new Scanner(System.in);
		String palavra = "";
		
		while(palavra.equalsIgnoreCase("sair")) {
			System.out.println("Digite algo...");
			palavra = entrada.nextLine();
		}
		
		entrada.close();
	}

}
