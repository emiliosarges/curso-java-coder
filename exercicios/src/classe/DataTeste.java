package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data data1 = new Data();
		data1.dia = 9;
		data1.mes = "Outubro";
		data1.ano = 1990;
		
		var data2 = new Data();
		data2.dia = 4;
		data2.mes = "Outubro";
		data2.ano = 1994;
		
		Data data3 = new Data();
		System.out.println(data3.obterDataFormatada());
		
		Data data4 = new Data(22, "Dezembro", 1972);
		System.out.println(data4.obterDataFormatada());
		
		System.out.print("Sua data de nascimento é: " + data1.obterDataFormatada());
		
		System.out.printf("\nSua data de nascimento é: %d de %s de %d\n",
				data2.dia, data2.mes, data2.ano);
		
		String dataFormatada2 = data2.obterDataFormatada();		
		
		System.out.println(dataFormatada2);
		
		System.out.println("Testando resultado obterDataFormatada(): " + data1.obterDataFormatada());
	}
}
