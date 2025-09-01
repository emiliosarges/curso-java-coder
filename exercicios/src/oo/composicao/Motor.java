package oo.composicao;

public class Motor {
	
	//Atributos
	final Carro carro;
	boolean ligado = false; 
	double FatorInjecao = 1;
	
	Motor(Carro carro) {
		this.carro = carro;
	}
	
	//Método
	int giros() {
		if(!ligado) {
			return 0;
		} else {
			return (int) Math.round(FatorInjecao * 3000) ;
		}
	}
}
