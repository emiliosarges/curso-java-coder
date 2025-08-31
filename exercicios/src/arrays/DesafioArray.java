package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas você quer informar:");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a " + (i+1) + "ª nota: ");
			notas[i] = entrada.nextDouble();
		}
		
		double soma = 0.0;
		for(double nota : notas) {
			soma += nota;
		}
		double media = soma / notas.length;
		
		System.out.println("A sua média é: " + media);
		String arrayDeNotas = Arrays.toString(notas);
		System.out.println("As notas informadas foram: " + arrayDeNotas);
		
		entrada.close();
	}
}