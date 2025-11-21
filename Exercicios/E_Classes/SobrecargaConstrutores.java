//Exercicio 107
class Carro{
    private String marcaDoCarro;
    private String modeloDoCarro;
    private int anoDoCarro;

    public Carro(){
        this.marcaDoCarro = "Desconhecida";
        this.modeloDoCarro = "Desconhecida";
        this.anoDoCarro = 0;
    }
    public Carro(String marca, String modelo){
        this.marcaDoCarro = marca;
        this.modeloDoCarro = modelo;     
    }
    public Carro(String marca, String modelo, int ano){
        this.marcaDoCarro = marca;
        this.modeloDoCarro = modelo;     
        this.anoDoCarro = ano;
    }
    public void ExibirDetalhes(){
        System.out.println("Marca: " + this.marcaDoCarro + ", Modelo: " + this.modeloDoCarro + ", Ano: " + anoDoCarro);
    }
}


public class SobrecargaConstrutores {
    public static void main(String[] args){
        Carro ca = new Carro();
        ca.ExibirDetalhes();

        Carro cb = new Carro("Hyunday", "Creta");
        cb.ExibirDetalhes();

        Carro cc = new Carro("Hyundai", "Creta", 2021);
        cc.ExibirDetalhes();
    }
}
