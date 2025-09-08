package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		
		Produto produto1 = new Produto("Camiseta", 100.00);
		Produto produto2 = new Produto("meia", 10.00);
		
		System.out.println("Produto: " + produto1.nome + " \nValor:" + produto1.preco + "\n");
		System.out.println("Produto: " + produto2.nome + " \nValor:" + produto2.preco + "\n");
		
		Item item1 = new Item(produto1, 5);
		Item item2 = new Item(produto2, 10);
		
		System.out.println("Produto: " + item1.produto.nome + "\nPreco: " + item1.produto.preco + "\nQuantidade: " + item1.quantidade);
		System.out.println("Produto: " + item2.produto.nome + "\nPreco: " + item2.produto.preco + "\nQuantidade: " + item2.quantidade);
		
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		compra1.itens.add(item1);
		compra1.itens.add(item2);
		
		compra2.itens.add(item1);
		compra2.itens.add(item1);
		
		System.out.println(compra1.itens);
		System.out.println(compra2.itens);
		
		cliente1.nome = "João";
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		
		double total = cliente1.obterValorTotal();
		
		System.out.println("Total de compras: " + "R$" + total);
		
		
	}
}
