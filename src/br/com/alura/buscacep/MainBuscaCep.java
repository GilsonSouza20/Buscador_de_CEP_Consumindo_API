package br.com.alura.buscacep;

import java.io.IOException;
import java.util.Scanner;
public class MainBuscaCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        CEP cep = new CEP();
        Scanner scan = new Scanner(System.in);

        String cepNumber;
        System.out.println("Digite o Cep que deseja buscar: ");
        cepNumber = scan.nextLine();
        Endereco novoEndereco = cep.readCepAPI(cepNumber);

        new GeraArquivoJSON(novoEndereco);
    }
}
