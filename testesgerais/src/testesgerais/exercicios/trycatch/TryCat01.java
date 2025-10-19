package testesgerais.exercicios.trycatch;

public class TryCat01 {
	private int primeiroNumero;
	private int segundoNumero;
	
	public TryCat01() {
		//Construtor vazio
	}
	
	public TryCat01(int primeiroNumero, int segundoNumero) {
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
	}
	
	public  int somarNumeros(int a, int b) {
		return a + b;
	}
	
	public  int somarNumeros() {
		return getPrimeiroNumero() + getSegundoNumero();
	}
	
	public int getPrimeiroNumero() {
		return this.primeiroNumero;
	}
	
	public int getSegundoNumero() {
		return this.segundoNumero;
	}
	
	public void setPrimeiroNumero(int primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}
	
	public void setSegundoNumero(int segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	
}
