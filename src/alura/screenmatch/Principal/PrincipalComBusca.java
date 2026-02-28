package alura.screenmatch.Principal;

import alura.screenmatch.excecao.ErrorDeConversorDeAnoException;
import alura.screenmatch.modelos.Titulo;
import alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.IllegalFormatException;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        try{
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite qual filme deseja assistir: ");
        var busca = leitura.nextLine();

        var endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=66106cea";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
      // System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);


            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println(meuTitulo);

            FileWriter escrita = new FileWriter("filmes.txt");
            escrita.write(meuTitulo.toString());
            escrita.close();

        } catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalFormatException e){
            System.out.println("Erro na formatação na busca: ");
            System.out.println(e.getMessage());
        } catch (ErrorDeConversorDeAnoException e){
            System.out.println(e.getMensagem());
        } finally {
            System.out.println("Programa finalizado!");
        }




    }
}

