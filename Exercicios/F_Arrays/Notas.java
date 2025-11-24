package Exercicios.F_Arrays;

public class Notas {
    
    public static void main(String[] args) {
        Double[] notas = new Double[5];
        
        notas[0] = 6.5;
        notas[1] = 7.5;
        notas[2] = 7.0;
        notas[3] = 6.0;
        notas[4] = 3.5;

        String saida = "";
        for(int i = 0; i < 5; i++){
            saida += notas[i].toString() + ", ";
        }

        System.out.println(saida);
    }
}
