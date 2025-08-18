package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Informe o salário 1:");
		String salario1 = leitura.nextLine().replace(",",".");
		System.out.print("Informe o salário 2:");
		String salario2 = leitura.nextLine().replace(",",".");
		System.out.print("Informe o salário 3:");
		String salario3 = leitura.nextLine().replace(",",".");
		
		leitura.close();
		
		double salarioConvertido1 = Double.parseDouble(salario1);
		
		double salarioConvertido2 = Double.parseDouble(salario2);
		
		double salarioConvertido3 = Double.parseDouble(salario3);
		
		double soma = salarioConvertido1 + salarioConvertido2 + salarioConvertido3;
		double media = soma / 3;
		
		System.out.printf(
				"A média dos últimos 3 salários é R$%.2f ", media);
				 
	}

}
