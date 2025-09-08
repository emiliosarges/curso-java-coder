package oo.composicao.desafio;

public class Item {
	Produto produto;
	int quantidade;
	
	Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		
		return "Produto: " + produto.nome + " | Preco: " + produto.preco + " | Quantidade: " + quantidade;
	}
	
	
}
