package br.com.alura.buscacep;

public record Endereco (String cep, String logradouro,
                       String complemento, String localidade, String uf) {
}
