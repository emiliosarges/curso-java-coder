package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno Príncipe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		
		System.out.println(livros.pop()); // gera exceção caso esteja vazia. 
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		
		//livros.size();
		//livros.clear();
		//livros.contains("O pequeno principe");
		//livros.isEmpty();
	}
}
