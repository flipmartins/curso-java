package classe;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.dia = 11;
		data1.mes = 02;
		data1.ano = 1987;
		
		Data data2 = new Data(28, 10, 2008);
		
		System.out.printf("Data: %d/%d/%d\n", data1.dia, data1.mes, data1.ano);
		System.out.printf("Data: %d/%d/%d\n", data2.dia, data2.mes, data2.ano);
		
//		Scanner entrada = new Scanner(System.in);
//		Data data3 = new Data();
//		System.out.println("Digite o dia: ");
//		data3.dia = entrada.nextInt();
//		System.out.println("Digite o mês: ");
//		data3.mes = entrada.nextInt();
//		System.out.println("Digite o ano: ");
//		data3.ano = entrada.nextInt();
//		
//		String dataFinal = data3.dataFormatada2();
//		
//		System.out.println("Data: " + dataFinal);
//		
		Data data4 = new Data();
		String dataFinal4 = data4.dataFormatada2();
		
		System.out.println("Data: " + dataFinal4);
		//entrada.close();
	}

}