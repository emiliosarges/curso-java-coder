package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		double media = 0;
		double soma = 0;
		int verificacao = 0;
		int contador = 0;

		do {
			System.out.print("\nDigite uma nota entre 0 e 10 ou -1 para sair: ");
			nota = entrada.nextDouble();
			verificacao = (int) nota;
			if (nota >= 0 && nota <= 10) {
				soma += nota;
				contador++;
				System.out.printf("\nNota %d é válida, você já digitou %d nota(as) válida(as).\n", verificacao,
						contador);
			} else if (nota < -1 || nota > 10) {
				System.out.println("\nATENÇÃO: Opção inválida!, tente novamente!\n");
			}

		} while (verificacao != -1);
		media = soma / contador;
		System.out.println("Finalizado");
		System.out.printf("Você digitou %d notas válida(as), a sua média é %.1f%n", contador, media);
		entrada.close();

	}
}
