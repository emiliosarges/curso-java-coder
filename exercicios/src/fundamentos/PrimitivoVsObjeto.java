package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
	
	//Objetos podem trabalhar com métodos associados. 
		String x = "Texto";
		x.indexOf(0, 4);
		
		String s = new String("Texto");
		s.toUpperCase();
	//Tipos primitivos não trabalham com métodos, pois guardam apenas o valor que lhe é atribuído. 
		int a = 123;  //Por ser um tipo primitivo não possui a notação ponto com algum comportamento associado. 
		System.out.println(a);
	//Se precisar usar um valor númerico com comportamente associado, deve-se usar o wrapper.
		
	//Wrapper é a versão objeto dos tipos primitivos. 
	}
}
