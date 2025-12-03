package Exercicios.U_DadosClimaticosAPI;

import org.json.JSONObject;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DadosClimaticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da cidade: ");
        String nomeCidade = scanner.nextLine();

        try{
                String dadosClimaticos = getDadosClimaticos(nomeCidade);

                if(dadosClimaticos.contains("\"code\":1006")){
                    System.out.println("Localização não encontrada, tente novamente!");
                } else{
                    imprimirDadosClimaticos(dadosClimaticos);
                    //System.out.println(dadosClimaticos);
                }
        }
        catch(Exception e){
            System.out.println("Erro ao processar, segue mensagem: " + e.getMessage());
        }
    }

    public static String getDadosClimaticos(String nomeCidade) throws Exception{
        String apiKey = Files.readString(Paths.get("Exercicios\\U_DadosClimaticosAPI\\apikey.txt")).trim();
        
        String formataNomeCidade = URLEncoder.encode(nomeCidade, StandardCharsets.UTF_8);
        String apiUrl = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + formataNomeCidade;
        
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();
        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public static void imprimirDadosClimaticos(String dadosClimaticos){
        
        JSONObject dadosJson = new JSONObject(dadosClimaticos);
        JSONObject infoMeteorologicas = dadosJson.getJSONObject("current");
        
        String cidade = dadosJson.getJSONObject("location").getString("name");
        String pais = dadosJson.getJSONObject("location").getString("country");
        Float temperatuaAtual = infoMeteorologicas.getFloat("temp_c");

        System.out.println("A temperatura na cidade: " + 
        cidade +
        ", no pais: " + 
        pais + 
        " é de: " +
        temperatuaAtual);
        
    }
}

