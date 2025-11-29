package Exercicios.Q_ProdFuncional;

public class TestaOperacaoMatematica {
    public static void main(String[] args) {
        OperacaoMatematica soma = (a, b) -> a + b;
        double result = soma.executar(10.0, 20.0);
        System.out.println(result);

        OperacaoMatematica subt = (a, b) -> a - b;
        result = subt.executar(10.0, 20.0);
        System.out.println(result);
    }
}
