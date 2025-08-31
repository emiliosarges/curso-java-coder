package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		//Offer e Add -> Adicionam elementos na fila
		//DIferença é o comportamente quando a fila está cheia!
		//Add lança uma exceção
		//Offer retorna false e não adiciona elemento na fila
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> Obtem o próximo elemento da fila sem remover.
		//DIferença é o comportamente quando a fila está vazia!
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção. 
		System.out.println(fila.element());
		
		
		
		//Poll e Remove -> Obtem o próximo elemento da fila e remove
		
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.size());
		System.out.println(fila.isEmpty());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		//System.out.println(fila.remove()); // lança exceção
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		//fila.contains()
	}
}
