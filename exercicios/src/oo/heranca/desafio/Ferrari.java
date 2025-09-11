package oo.heranca.desafio;

public class Ferrari extends Carro {
	int acelerar () {
		velocidadeAtual += 15;
		if (velocidadeAtual > 100) {
			velocidadeAtual = 100;
		}
		return velocidadeAtual;
	}
	
	
}
