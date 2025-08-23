package controle;

import java.util.Scanner;

public class DesafioDiaSemanaDois {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digita um dia da semana: ");
		String dia = entrada.next().toLowerCase().replace("ç", "c").replace("á", "a");
		
		if (dia.equals("domingo")) {
			System.out.println("1 - Domingo");
		} else if (dia.equals("segunda")) {
			System.out.println("2 - Segunda");
		} else if (dia.equals("terca")) {
			System.out.println("3 - Terça");
		} else if (dia.equals("quarta")) {
			System.out.println("4 - Quarta");
		} else if (dia.equals("quinta")) {
			System.out.println("5 - Quinta");
		} else if (dia.equals("sexta")) {
			System.out.println("6 - Sexta");
		} else if (dia.equals("sabado")) {
			System.out.println("7 - Sábado");
		} else {
			System.out.println("Dia inválido!");
		}
		entrada.close();
	}
}
