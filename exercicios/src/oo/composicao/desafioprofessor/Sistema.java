package oo.composicao.desafioprofessor;

public class Sistema {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem("Notebook", 1897.88, 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10.00, 10);
		compra2.adicionarItem("Impressora", 998.90, 1);
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.compras.add(compra1); // possibilidade 1
		cliente.adicionarCompra(compra2);; // possibilidade 2 (Funcao criada na classe cliente)
		
		System.out.println(cliente.obterValorTotal());
	}
	
}
