package fundamentos;

import java.util.Scanner;

//DESAFIO: Fazer uma calculadora sem uasr IF ELSE. Usar somente o conteúdo das aultas até aqui. 

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		Double num1 = entrada.nextDouble();
		System.out.println("Digite o segundo número: ");
		Double num2 = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Digite a operação que deseja fazer: +, -, *, /, ou % ");
		String operacao = entrada.nextLine();
		entrada.close();
		
		Double soma = num1 + num2;
		Double subtracao = num1 - num2;
		Double multiplicacao = num1 * num2;
		Double divisao = num1 / num2;
		Double modulo = num1 % num2;
		
		
		
		String resultado =	operacao.equals("+") ? soma.toString() :
							operacao.equals("-") ? subtracao.toString() : 
							operacao.equals("*") ? multiplicacao.toString() : 
							operacao.equals("/") ? divisao.toString() : 
							operacao.equals("%") ? modulo.toString() : "Operação Inválida";
		
		System.out.println(resultado);
		
	}

}
