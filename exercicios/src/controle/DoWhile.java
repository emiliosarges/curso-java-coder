package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("Você precisa falar as palavras mágicas");
			System.out.print("Quer sair?");
			texto = entrada.nextLine().toLowerCase();
		} while(!texto.equals("por favor"));
		System.out.println("Programa finalizado!");
		entrada.close();
	}
}
