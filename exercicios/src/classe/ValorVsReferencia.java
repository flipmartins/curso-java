package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		int a = 2;
		int b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //Atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}

}
