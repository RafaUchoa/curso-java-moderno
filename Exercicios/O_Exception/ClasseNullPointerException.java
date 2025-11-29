package Exercicios.O_Exception;

public class ClasseNullPointerException {
     public static void main(String[] args) {
        Integer numero = null;
        try{
            numero.toString();
        }
        catch(NullPointerException e){
            System.out.println("Erro de conversão: " + e.getMessage());
        }
    }
}
