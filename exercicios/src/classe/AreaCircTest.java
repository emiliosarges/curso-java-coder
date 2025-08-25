package classe;

public class AreaCircTest {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10; //posso alterar o valor do raio por ser um membro de instancia. 
		
		AreaCirc a2 = new AreaCirc(5);
		a2.raio = 100;
		
		//Não é possível alterar o valor de PI, pois é um membro de classe constante.
		//O mais comum é que membros de classe sejam constantes. 
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		
		System.out.println("Acessando método estático: " + AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
	}
}
