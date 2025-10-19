package testesgerais.exercicios.escrever;

import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {
	public static void main(String[] args) {
		
		
		try (FileWriter escrever = new FileWriter("teste.txt")) {
			escrever.write("Conteúdo a ser gravado no arquivo.");
		} catch (IOException e) {
			System.out.println("Erro!");
		}
		
	}
}
