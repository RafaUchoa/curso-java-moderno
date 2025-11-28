package Exercicios.L_Polimorfismo;

public class Calculadora {
    public static void main(String[] args) {
        Operacao soma = new Soma();
        Operacao subt = new Subtracao();
        Operacao mult = new Multiplicacao();
        Operacao divs = new Divisao();

        double result = 0.00;

        result = soma.calcular(10.0, 10.0);
        System.out.println(result);

        result = subt.calcular(10.0, 10.0);
        System.out.println(result);

        result = mult.calcular(10.0, 10.0);
        System.out.println(result);

        result = divs.calcular(10.0, 10.0);
        System.out.println(result);

    }
}
