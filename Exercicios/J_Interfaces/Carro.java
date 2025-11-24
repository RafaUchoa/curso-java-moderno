package Exercicios.J_Interfaces;

public class Carro implements Veiculo{
    public void buzinar(){
        System.out.println("Carro buzinando");
    }

    public void iniciar(){
        System.out.println("Carro Ligando");
    }

    public void parar(){
        System.out.println("Carro parando");
    }

    public static void main(String[] args) {
        Carro c = new Carro();
        c.buzinar();
        c.iniciar();
        c.parar();
    }
}