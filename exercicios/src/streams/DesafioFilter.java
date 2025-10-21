package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		
		Carro c1 = new Carro("VolksWagen", 1990, false);
		Carro c2 = new Carro("Chevrolet", 2015, true);
		Carro c3 = new Carro("Ford", 1987, true);
		Carro c4 = new Carro("Jeep", 1942, true);
		Carro c5 = new Carro("Fiat", 2013, false);
		Carro c6 = new Carro("VolksWagen", 1970, true);
		Carro c7 = new Carro("Fiat", 2017, true);
		
		List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6, c7);
		Predicate<Carro> isLuxuoso = carro -> carro.isLuxo;
		Predicate<Carro> isAntigo = carro -> carro.ano < 1990;
		Function<Carro, String> disponivel = carro -> "Disponível: " + carro.marca;
		
		carros.stream()
			.filter(isLuxuoso)
			.filter(isAntigo)
			.map(disponivel)
			.forEach(System.out::println);
	}
}
