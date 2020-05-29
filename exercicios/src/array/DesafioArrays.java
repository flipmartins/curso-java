package array;

import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {
		//Perguntar quantas notas serão inseridas
		//Receber as notas usando for
		//Somar as notas usando foreach e exibir a média
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas você deseja inserir?");
		int quantidadeNotas = entrada.nextInt();
		
		do {
			
			System.out.println("Informe um valor válido!");
			System.out.println("Quantas notas você deseja inserir?");
			quantidadeNotas = entrada.nextInt();
			
		} while(quantidadeNotas <= 0);
		
		double[] notas = new double[quantidadeNotas];
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("Digite a nota " + (i + 1) + ":");
			notas[i] = entrada.nextDouble();
			
			if(notas[i] < 0 || notas[i] > 10) {
				System.out.println("Nota inválida!");
				i--;
			}
		}
		
		double totalNotas = 0;
		
		for(double mostrarNotas : notas) {			
			totalNotas += mostrarNotas;
		}
		
		double media = totalNotas / quantidadeNotas;
		System.out.printf("A média das notas informadas é: %.1f", media);
		
		entrada.close();
	}

}
