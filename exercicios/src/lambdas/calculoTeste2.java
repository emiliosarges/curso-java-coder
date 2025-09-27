package lambdas;

public class calculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> {return x + y; };
		System.out.println(calc.executar(4, 3));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(4, 3));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}
}