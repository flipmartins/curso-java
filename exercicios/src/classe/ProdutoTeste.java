package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4200.00;
		Produto.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 2.00;
		Produto.desconto = 0.10;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto(0.30);
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println("Preço final do " + p1.nome + " é: R$" + precoFinal1);
		System.out.println("Preço final do " + p2.nome + " é: R$" + precoFinal2);
	}

}
