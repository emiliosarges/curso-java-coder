package excecao;



public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			
			System.out.println(e.getMessage());
		}
		
		geraErro3();
		
		System.out.println("Fim :)");
		
	}
	
	//EXCEÇÃO NÃO CHECADA OU NÃO VERIFICADA
	static void geraErro1() {
		throw new RuntimeException("Erro #01");
	}
	
	//EXCEÇÃO CHECADA OU VERIFICADA
	static void geraErro2() throws Exception {
		throw new Exception("Erro #02");
	}
	
	static void geraErro3() {
		try {
			throw new Exception("Erro #03");
		} catch (Exception e) {
			System.out.println("Esse é um tipo de erro: " + e.getMessage());
		}
	}
}
