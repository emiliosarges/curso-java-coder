package testesgerais.exercicios.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCat01Test {
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("CALCULADORA DE SOMAR 2 NÚMEROS! ");
		TryCat01 somar = new TryCat01();
			
		System.out.println("Digite primeiro número: ");
		int primeiroNumero = scanner.nextInt();
		somar.setPrimeiroNumero(primeiroNumero);
		System.out.println("Digite o segundo número: ");
		int segundoNumero = scanner.nextInt();
		somar.setSegundoNumero(segundoNumero);
		
		int resultado = somar.somarNumeros();
		System.out.println("O resultado da soma é: " + resultado);
			
		} catch (InputMismatchException e) {
			System.out.println("Erro: o programa só número inteiros: ");
		} catch (Exception e) {
			System.out.println("Erro inesperado: " + e.getClass().getSimpleName());
		}
	}
}
