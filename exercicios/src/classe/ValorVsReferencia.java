package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //Atribuição por valor (Tipo primitivo)
		
		a++;
		a--;
		
		System.out.println("Valor de a: " + a + " | " + "Valor de b: " + b);
		
		Data d1 = new Data(1,"junho", 2022);
		Data d2 = d1; //Atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = "dezembro";
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d1.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d1.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
		
		
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = "janeiro";
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}

}
