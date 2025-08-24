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
		
		System.out.printf("Sua data de nascimento é: %d de %s de %d\n",
				data1.dia, data1.mes, data1.ano);
		System.out.printf("Sua data de nascimento é: %d de %s de %d\n",
				data2.dia, data2.mes, data2.ano);
	}
}
