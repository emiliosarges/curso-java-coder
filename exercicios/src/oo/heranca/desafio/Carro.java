package oo.heranca.desafio;

public class Carro {
	int velocidadeAtual;
	
	public int acelerar () {
		velocidadeAtual += 5;
		if (velocidadeAtual > 100) {
			velocidadeAtual = 100;
		}
		return velocidadeAtual;
	}
	
	int frear () {
		velocidadeAtual -= 5;
		if (velocidadeAtual < 0) {
			velocidadeAtual = 0;
		}
		return velocidadeAtual;
	}
}
