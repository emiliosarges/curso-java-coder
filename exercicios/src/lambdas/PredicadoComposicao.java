package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0; 
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		//or() and() negate()
		
		System.out.println(isPar.and(isTresDigitos).negate().test(10));
		System.out.println(isPar.or(isTresDigitos).negate().test(50));
	}
}
