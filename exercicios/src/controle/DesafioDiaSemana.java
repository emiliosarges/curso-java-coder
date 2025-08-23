package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um núemro: ");
		
		int numero = teclado.nextInt();
		
		if(numero == 1) {
			System.out.println("Domingo");
		} else if(numero == 2) {
			System.out.println("Segunda");
		} else if(numero == 3) {
			System.out.println("Terça");
		} else if(numero == 4) {
			System.out.println("Quarta");
		} else if(numero == 5) {
			System.out.println("Quinta");
		} else if(numero == 6) {
			System.out.println("Sexta");
		} else if(numero == 7) {
			System.out.println("Sábado");
		}
		
		teclado.close();
	}
}
