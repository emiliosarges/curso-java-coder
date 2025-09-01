package oo.composicao;

public class Carro {
	
	//Atributo
	final Motor motor;
	
	//Construtor
	Carro() {
		this.motor = new Motor(this);
	}
	
	
	//Métodos
	void acelerar() {
		if(motor.FatorInjecao < 2.6) {
			motor.FatorInjecao += 0.4;	
		}
	}
	
	void frear() {
		if(motor.FatorInjecao > 0.5) {
			motor.FatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
