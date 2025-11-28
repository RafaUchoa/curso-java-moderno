package Exercicios.K_Abstratas;

public class LojaMain {
    public static void main(String[] args) {
        LojaComercial lj = new LojaComercial("123", "Uchoa", false);

        lj.abrir();
        lj.fechar();
    }
}
