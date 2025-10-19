package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n"); //USANDO STREAM OF
		langs.forEach(print);
		
		
		String[] maisLangs = {"Python ","Lisp ","Per ","Go\n"};
		Stream.of(maisLangs).forEach(print); //USANDO STREAM OF USANDO UM ARRAY COMO PARÂMETRO
		
		Arrays.stream(maisLangs).forEach(print); //USANDO ARRAYS.STREAM PASSANDO UM ARRAY COMO PARÂMETRO
		
		Arrays.stream(maisLangs, 1, 2).forEach(print); //USANDO STREAM ARRAYS É POSSÍVEL TAMBÉM USAR PARÂMETROS COMO FILTRO.
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n"); // CRIANDO UMA LISTA
		outrasLangs.stream().forEach(print); //USANDO UM MÉTODO STREAM NA LISTA CRIADA ACIMA E CHAMANDO UM METODO STREAM 
		outrasLangs.parallelStream().forEach(print);
		
		//Stream.generate(()-> "a").forEach(print); //PASSADO UM SUPPLIER - LOOP INFINITO IMPRIMINDO A.
		//Stream.iterate(0, n -> n +1).forEach(println); //PASSADO UM ITERATOR - LOOP INFINITO.
		
	}
	
}
