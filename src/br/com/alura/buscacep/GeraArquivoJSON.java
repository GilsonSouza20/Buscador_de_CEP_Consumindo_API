package br.com.alura.buscacep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeraArquivoJSON {
    public GeraArquivoJSON(Record jsonText) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escreve = new FileWriter("cep.json");
        escreve.write(gson.toJson(jsonText));
        escreve.close();
    }
}
