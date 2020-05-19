package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		//Receber via Scanner 3 sálarios e calcular a média
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu antepenúltimo salário: ");
		String salario01 = entrada.nextLine().replace(",", ".");
		
		
		System.out.println("Informe seu penúltimo salário: ");
		String salario02 = entrada.nextLine().replace(",", ".");;
	
		System.out.println("Informe seu último salário: ");
		String salario03 = entrada.nextLine().replace(",", ".");
		
		Double salario1 = Double.parseDouble(salario01);
		Double salario2 = Double.parseDouble(salario02);
		Double salario3 = Double.parseDouble(salario03);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("Média dos últimos 3 salários é: R$" + media);
		
		entrada.close();
	}

}
