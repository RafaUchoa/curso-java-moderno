package Exercicios.N_Collections;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    public ArrayList<String> listaFilmes;

    public Locadora(){
        listaFilmes = new ArrayList<>();
    }
    
    public void addFilme(String filme){
        listaFilmes.add(filme);
    }

    public boolean existeFilme(String filme){
        return listaFilmes.contains(filme);
    }

    public List<String> getTodosFilmes(){
        return listaFilmes;
    }

    public static void main(String[] args) {
        Locadora tocaia = new Locadora();
        tocaia.addFilme("durodematar");
        tocaia.addFilme("devoltafuturo");
        tocaia.addFilme("robocop");

        System.out.println("O filme moana existe? " + tocaia.existeFilme("moana"));
        System.out.println("O filme robocop existe? " + tocaia.existeFilme("robocop"));

        System.out.println("Lista de filmes: " + tocaia.getTodosFilmes());
    }
}
