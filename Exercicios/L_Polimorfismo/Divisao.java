package Exercicios.L_Polimorfismo;

public class Divisao extends Operacao {
    @Override
    public Double calcular(Double a, Double b){

        Double calc = 0.00;
        try{
            calc = a / b;
        }
        catch(ArithmeticException e){
            System.out.println("Erro ao calcular: " + e.getMessage());
        }

        return calc;
    }    
}
