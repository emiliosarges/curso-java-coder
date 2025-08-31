package classe.respostaprofessor;

public class Jantar {
	public static void main(String[] args) {
		Comida arroz = new Comida("Arroz", 0.223);
		Comida feijao = new Comida("Feijão", 0.300);
		
		Pessoa pessoa = new Pessoa("João", 99.8);
		
		System.out.println(pessoa.apresentar());
		pessoa.comer(arroz);
		System.out.println(pessoa.apresentar());
		pessoa.comer(feijao);
		System.out.println(pessoa.apresentar());
		
	}
}
