package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Felipe", 80.0);
		Comida c1 = new Comida("Carne", 1.0);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
	}

}
