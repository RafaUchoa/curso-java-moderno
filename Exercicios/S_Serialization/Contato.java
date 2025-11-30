package Exercicios.S_Serialization;

import java.io.Serializable;

public class Contato implements Serializable {
    public String nome;
    public String telefone;

    public Contato(String initNome, String initTelefone){
        this.nome = initNome;
        this.telefone = initTelefone;
    }
}


