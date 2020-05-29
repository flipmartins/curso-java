package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	//Construtor padrão, não recebe argumentos
	Produto() {
		
	}
	
	//Construtor criado, recebe argumentos
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	//Não precisa receber nada de parametro pq o objeto já tem os dados
	double precoComDesconto() {
		return preco - (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco - (1 - desconto + descontoDoGerente);
	}
}
