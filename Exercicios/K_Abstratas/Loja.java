package Exercicios.K_Abstratas;

public abstract class Loja {
    public String cnpj;
    public String razaoSocial;
    public boolean aberta;

    public abstract boolean abrir();
    public abstract boolean fechar();
}
