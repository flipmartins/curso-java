package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		//Recebe uma nota valida
		//Total, notas validas, -1 sai

		String notaRecebida;
		double media = 0.0;
		double total = 0.0;
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite a nota: ");
			notaRecebida = entrada.next();
			double notaValida = Double.parseDouble(notaRecebida);
			
			if(notaValida >= 0 && notaValida <= 10) {
				total = total + notaValida;
				contador++;
			} else if(notaValida != -1) {
				System.out.println("Digite uma nota válida!");
			}
			
		} while (!notaRecebida.equals("-1"));
		
		media = total / contador;
		
		System.out.println("Total de notas: " + total);
		System.out.printf("Média de notas: %.1f", media);
		
		entrada.close();
	}

}
