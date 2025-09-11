package oo.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Carro ferrari = new Ferrari();
		
		System.out.println("Ferrari Velocidade Inicial: " + ferrari.velocidadeAtual);
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		System.out.println("Ferrari Velocidade Final: " + ferrari.velocidadeAtual);
		
		Civic civic = new Civic();
		
		System.out.println("Civic Velocidade Inicial: " + civic.velocidadeAtual);
		civic.acelerar();
		civic.acelerar();
		civic.frear();
		System.out.println("Civic Velocidade Final: " + civic.velocidadeAtual);
		
	}
}