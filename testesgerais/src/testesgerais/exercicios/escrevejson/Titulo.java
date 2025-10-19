package testesgerais.exercicios.escrevejson;

import com.google.gson.Gson;

public class Titulo {
	public static void main(String[] args) {
		
	        EscreveJSON titulo = new EscreveJSON("Emilio", 34, "email@email"); 

	        Gson gson = new Gson();
	        String json = gson.toJson(titulo);

	        System.out.println(json);
	    
	}//ERRADO - TESTAR DEPOIS - ESCLUIR ESSA CLASSE
}
