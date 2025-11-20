public class SomaPositivos {
    public static void main(String[] args){

        int valorRef = 10;
        int contador = 1;
        int acumulador = 0;

        do{
            if (contador % 2 == 0){
                acumulador += contador;
                System.out.println(contador + " é par, somando: " + acumulador);
            }
            contador += 1;
        }while(contador <= valorRef);

        System.out.println("Resultado final: " + acumulador);

    }    
}
