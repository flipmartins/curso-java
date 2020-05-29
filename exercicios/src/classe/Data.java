package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String dataFormatada() {
		String diaFormatado = Integer.toString(dia);
		String mesFormatado = Integer.toString(mes);
		String anoFormatado = Integer.toString(ano);
		
		return diaFormatado.concat("/") + mesFormatado.concat("/") + anoFormatado;
	}
	
	String dataFormatada2() {
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}
}
