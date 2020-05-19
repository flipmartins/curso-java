package fundamentos;

import java.util.Scanner;

public class DesafioOperLogicos {

	public static void main(String[] args) {
		//Trabalho terça e quinta
		//TV 50 ou 32 e sorvete
		//Ficar em casa
		
		boolean trabalhoTerca;
		boolean trabalhoQuinta;
		boolean sorvete;
		String respostaTrabalho1;
		String respostaTrabalho2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Trabalhou na terça?");
		respostaTrabalho1 = entrada.nextLine();
		
		System.out.println("Trabalhou na quinta?");
		respostaTrabalho2 = entrada.nextLine();
		
		if("sim".equals(respostaTrabalho1)) {
			trabalhoTerca = true;
			sorvete = true;
		} else {
			trabalhoTerca = false;
			sorvete = false;
			
		}
		
		if("sim".equals(respostaTrabalho2)) {
			trabalhoQuinta = true;
			sorvete = true;
		} else {
			trabalhoQuinta = false;
			sorvete = false;
		}
		
		if(trabalhoTerca == true && trabalhoQuinta == true && sorvete == true) {
			System.out.println("Comprou a TV de 50 polegadas e tomou sorvete!!");
		} else if(trabalhoTerca == true || trabalhoQuinta == true || sorvete == true) {
			System.out.println("Comprou a TV de 32 polegadas e tomou sorvete!!");
		} else {
			System.out.println("Ficou em casa!!");
		}
		
		entrada.close();
	}

}
