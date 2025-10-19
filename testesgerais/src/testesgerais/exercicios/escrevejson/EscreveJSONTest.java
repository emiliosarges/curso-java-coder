package testesgerais.exercicios.escrevejson;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreveJSONTest {
    public static void main(String[] args) {
        try {
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .serializeNulls() 
                    .create();

            List<EscreveJSON> listaDeCadastro = new ArrayList<>();
            listaDeCadastro.add(new EscreveJSON("Emílio", 34, "emilio@email.com"));
            listaDeCadastro.add(new EscreveJSON("Luiza", 33, "luiza@email.com"));

            try (FileWriter escreve = new FileWriter("cadastro.json")) {
                escreve.write(gson.toJson(listaDeCadastro));
            }
            System.out.println("Arquivo gerado: cadastro.json");
        } catch (Exception e) {
            System.out.println("Erro ao escrever JSON: " + e.getMessage());
        }
    }
}

