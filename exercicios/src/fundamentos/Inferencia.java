package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5; //declaração e inicialização
		System.out.println(a);
		
		//Nesse caso não ocorre erro, pois todo int está dentro de double.
		//O número é convertido para 12.0
		a = 12;
		System.out.println(a); 
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
	//	c = 4.5; -> Erro, pois o tipo de c por inferência é String
		
		double d; //variável declarada
		d = 123.65; // variável inicializada
		System.out.println(d); // usada!
		
		/*Se usar o var é necessário já inicializar a variável na mesma linha.
		 * var e; 
		 * e = 123.45;
		*/
	}
}
