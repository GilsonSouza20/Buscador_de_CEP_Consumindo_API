package br.com.alura.buscacep;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CEP {
    public Endereco readCepAPI(String cepNumber) throws IOException, InterruptedException {
        //leitura de API

        URI endereco = URI.create("https://viacep.com.br/ws/"+cepNumber+"/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //String json = response.body();
        //System.out.println(json);
        return new Gson().fromJson(response.body(), Endereco.class);
    }
}
