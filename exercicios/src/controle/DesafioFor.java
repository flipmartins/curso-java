package controle;

public class DesafioFor {

	public static void main(String[] args) {
		//Não pode usar valor númerio para controlar o laço
		
		for(String s = "#"; !s.equals("######"); s += "#") {
			System.out.println(s);
		}

	}

}
