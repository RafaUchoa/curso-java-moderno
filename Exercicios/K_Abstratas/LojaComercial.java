package Exercicios.K_Abstratas;

public class LojaComercial extends Loja {
    
    public LojaComercial(String cnpj_p, String razao_p, boolean aberta_p){
        this.cnpj = cnpj_p;
        this.razaoSocial = razao_p;
        this.aberta = aberta_p;
    }

    public boolean abrir(){
        this.aberta = true;
        System.out.println("Status da loja aberta: " + this.aberta);
        return this.aberta;
    }

    public boolean fechar(){
        this.aberta = false;
        System.out.println("Status da loja aberta: " + this.aberta);
        return this.aberta;
    }
}
