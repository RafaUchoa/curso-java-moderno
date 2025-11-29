package Exercicios.O_Exception;

public class ArrayExercicio {

    public int acessarElemento(int[] array, int indice){
        try{
            return array[indice];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro ao acessar o indice: " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayExercicio arr = new ArrayExercicio();

        int[] meuArray = {10, 20, 30, 40, 50};
        
        int ret = arr.acessarElemento(meuArray, 0);
        System.out.println("Valor do indice 0: " + ret);

        ret = arr.acessarElemento(meuArray, 4);
        System.out.println("Valor do indice 4: " + ret);

        ret = arr.acessarElemento(meuArray, 5);
        System.out.println("Valor do indice 5: " + ret);


    }
}
