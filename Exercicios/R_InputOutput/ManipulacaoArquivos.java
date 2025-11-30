package Exercicios.R_InputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulacaoArquivos {

    FileWriter fw;
    FileReader fr;

    public void escreverArquivo(String nomeArq, String conteudo) throws IOException{
        this.fw = new FileWriter(nomeArq);
        this.fw.write(conteudo);
        this.fw.close();
    }

    public String lerArquivo(String nomeArq) throws FileNotFoundException, IOException{
        
        this.fr = new FileReader(nomeArq);
        
        int charDaVez = 0;
        String texto = "";
        do{
            charDaVez = this.fr.read();
            texto += (char)charDaVez;
        }
        while(charDaVez != -1);        
        
        this.fr.close();

        return texto;
    }

    public static void main(String[] args) {
        ManipulacaoArquivos ma = new ManipulacaoArquivos();
        String arq = "C:/Git/curso-java-moderno/Exercicios/R_InputOutput/ManipulacaoArquivo.txt";
        try{
            ma.escreverArquivo(arq, "exercicio263");
            String conteudo = ma.lerArquivo(arq);
            System.out.println("Conteúdo escrito: " + conteudo);
        }
        catch(IOException e){
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }
}
