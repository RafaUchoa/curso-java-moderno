package Exercicios.I_Imutabilidade;

public class FinalVariables {
    private final int numeroMaximo = 100;
    private final String mensagem = "Oi";

    public static void main(String[] args) {
        this.numeroMaximo = 110; // Vai dar erro, pois a variavel é fixa, não pode ser alterada
        this.mensagem = "Ola";
    }
}
