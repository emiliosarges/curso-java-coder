package classe;

public class Data {
	int dia;
	String mes;
	int ano;
	
	Data() {
		//dia = 1;
		//mes = "Janeiro";
		//ano = 1970;
		
		this(1, "Outubro", 1970);
	}
	
	Data (int dia, String mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		return this.dia + " de " + mes + " de " + ano;
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
}

