package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler dois números
		//Ler operador
		
		double num1;
		double num2;
		String operador;
		double resultado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número");
		num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação que deseja executar");
		operador = entrada.next();
		
		resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.printf("O resultado é: %.1f %s %.1f = %.1f", num1, operador, num2, resultado);
		
		entrada.close();

	}

}
