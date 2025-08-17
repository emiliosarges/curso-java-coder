package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.toUpperCase().replace("X", "Senhora");
		s = s.concat("!!!");
		
		
		
		System.out.println(s);
		
		System.out.println("Emílio".toUpperCase());
		
		String y = "Boa tarde, X"
				.replace("X", "Luiza")
				.toLowerCase();
		System.out.println(y.concat("!!"));
		
		// Tipos primitivos não tem o operador "."
		
	}
}
