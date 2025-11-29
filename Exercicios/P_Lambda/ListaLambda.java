package Exercicios.P_Lambda;

import java.util.ArrayList;
import java.util.List;

public class ListaLambda {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("maça");
        lista.add("banana");
        lista.add("morango");

        lista.removeIf(x -> x.length() > 5);

        lista.forEach(x -> System.out.println(x));
        //System.out.println("Resultado da lista: " + lista.toString());

    }
}
