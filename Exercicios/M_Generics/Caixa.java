package Exercicios.M_Generics;

@SuppressWarnings("unchecked")
public class Caixa<T> {

    private T[] elementos;

    public Caixa(int capac){
        this.elementos = (T[]) new Object[capac];
    }

    public void adiciona(T elemento, int indice){
        this.elementos[indice] = elemento;
    }

    public T obter(int indice){
        return this.elementos[indice];
    }

    public static void main(String[] args) {
        Caixa<Double> caixaDouble = new Caixa<>(3);
        
        caixaDouble.adiciona(12.90, 0);
        caixaDouble.adiciona(13.90, 1);
        caixaDouble.adiciona(14.90, 2);

        System.out.println(caixaDouble.obter(0));
    }
}
