package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Emílio", 90.5);
		
		Comida comida1 = new Comida("Feijoada", 0.50);
		Comida comida2 = new Comida("Arroz", 10.00);
		
		double novoPeso = (pessoa1.comer(comida1.pesoComida));
		
		System.out.println("O peso do(a) " + pessoa1.nomePessoa
							+ " era de " + pessoa1.pesoPessoa + " Kilos."
							+ " Mas após comer " + comida1.nomeComida
							+ " seu novo peso agora é " + novoPeso);
		
		novoPeso =  (pessoa1.comer(comida2.pesoComida));
		System.out.println("O peso do(a) " + pessoa1.nomePessoa
				+ " era de " + pessoa1.pesoPessoa + " Kilos."
				+ " Mas após comer " + comida2.nomeComida
				+ " seu novo peso agora é " + novoPeso);
	}
} 
