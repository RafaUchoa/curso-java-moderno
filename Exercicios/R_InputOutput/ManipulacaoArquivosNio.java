package Exercicios.R_InputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManipulacaoArquivosNio {

    FileWriter fw;
    FileReader fr;

    public void escreverArquivo(String nomeArq, String conteudo) throws IOException{
        Path caminho = Paths.get("C:\\Git\\curso-java-moderno\\Exercicios\\R_InputOutput\\ManipulacaoArquivosNio.txt");
        Files.write(caminho, conteudo.getBytes());
    }

    public String lerArquivo(String nomeArq) throws IOException{
        
        Path caminho = Paths.get("C:\\Git\\curso-java-moderno\\Exercicios\\R_InputOutput\\ManipulacaoArquivosNio.txt");

        String conteudo = "";
        try{
            conteudo = Files.readAllBytes(caminho).toString();
        }
        catch(IOException e){
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        return conteudo;
    }

    public static void main(String[] args) {
        ManipulacaoArquivos ma = new ManipulacaoArquivos();
        String arq = "C:/Git/curso-java-moderno/Exercicios/R_InputOutput/ManipulacaoArquivosNio.txt";
        try{
            ma.escreverArquivo(arq, "exercicio264");
            String conteudo = ma.lerArquivo(arq);
            System.out.println("Conteúdo escrito: " + conteudo);
        }
        catch(IOException e){
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }
}
