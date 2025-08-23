package controle;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		while(!texto.equals("sair")) {
			System.out.print("Digite algo: ");
			texto = entrada.next().toLowerCase();
		}
		
		System.out.println("Parabéns! Você descobriu como sair!");
		entrada.close();
	}
		
}
