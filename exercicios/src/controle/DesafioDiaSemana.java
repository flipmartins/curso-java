package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		//Receber o dia da semana e retornar o número do dia
		//Ex.: Domingo = 1
		//Usar estrutura if else
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		String dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println("Domingo = 1");
		} else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println("Segunda = 2");
		} else if("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.println("Terça = 3");
		} else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Quarta = 4");
		} else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Quinta = 5");
		} else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Sexta = 6");
		} else if("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
			System.out.println("Sábado = 7");
		} else {
			System.out.println("Dia inválido!");
		}
		
		entrada.close();

	}

}
