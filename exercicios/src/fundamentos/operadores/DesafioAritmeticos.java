package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		//Desafio proposto. Nível fácil
		
		double operacao1 = 6 * (3 + 2);
		double operacao2 = Math.pow(operacao1, 2);
		double operacao3 = 3 * 2;
		double operacao4 = operacao2 / operacao3;
		
		double operacao5 = (1 - 5) * (2 - 7);
		double operacao6 = operacao5 / 2;
		double operacao7 = Math.pow(operacao6, 2);
		
		double operacao8 = operacao4 - operacao7;
		double operacao9 = Math.pow(operacao8, 3);
		
		double operacao10 = Math.pow(10, 3);
		double operacaoFim = operacao9 / operacao10;
		
		System.out.println(operacaoFim);
		
	}
	
}
