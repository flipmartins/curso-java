package fundamentos;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		int resultadoLadoE;
		int resultadoLadoD;
		int superior;
		int inferior;
		int total;
		
		a = (int) Math.pow(6 * (3 + 2), 2);
		b = 3 * 2;
		c = (int) Math.pow((1 - 5) * (2 - 7), 2);
		d = (int) Math.pow(2, 2);
		
		resultadoLadoE = a / b;
		resultadoLadoD = c / d;

		superior = (int) Math.pow(resultadoLadoE - resultadoLadoD, 3);
		inferior = (int) Math.pow(10, 3);
		
		total = superior / inferior;
		System.out.println("O resultado é: " + total);
	}

}
