package classe.desafio;

public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
	double pesoAposComer;
	
	Pessoa(String nomePessoa, double pesoPessoa) {
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	double comer(double pesoComida) {
		return pesoAposComer = pesoPessoa + pesoComida;
	}
}
 