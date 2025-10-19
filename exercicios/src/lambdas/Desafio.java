package lambdas;


import java.util.function.Function;


public class Desafio {
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal = produto -> produto.preco * (1 - produto.desconto);
		
		Function<Produto, Double> impostoMunicipal = produto -> {
			double valor = precoReal.apply(p); 
			return valor >= 2500 ? 
					valor * (1 + 0.085): valor;
		};
		
		Function<Produto, Double> frete = produto -> {
			double valor = impostoMunicipal.apply(p);
			return valor >= 3000 ?
					(valor += 100) : (valor += 50);
		};
		
		double resultado = frete.apply(p);
		
		System.out.printf("\nO valor do %s é R$%.2f ", p.nome, resultado);
	}
}
