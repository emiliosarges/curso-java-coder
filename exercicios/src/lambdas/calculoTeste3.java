package lambdas;

import java.util.function.BinaryOperator;

public class calculoTeste3 {
	
	public static void main(String[] args) {
		
		//Uso de interface funcional
		
		BinaryOperator<Double> calc = (x, y) -> {return x + y; };
		System.out.println(calc.apply(4.0, 3.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(4.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> {return x + y; };
		System.out.println(calc2.apply(4, 3));
		
		calc2 = (x, y) -> x * y;
		System.out.println(calc2.apply(4, 3));
		
	}
}