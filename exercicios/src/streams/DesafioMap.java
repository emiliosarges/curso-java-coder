package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		Consumer<Integer> print = System.out::println;
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		
		Function<Integer, String> converteInteiroParaBinarioString = Integer::toBinaryString;
		UnaryOperator<String> inverteString = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> converteBinarioStringParaInterio = s -> Integer.parseInt(s, 2);
		
		nums.stream()
			.map(converteInteiroParaBinarioString)
			.map(inverteString)
			.map(converteBinarioStringParaInterio)
			.forEach(print);
		
	}
}
	
