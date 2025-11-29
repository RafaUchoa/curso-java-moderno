package Exercicios.M_Generics;

public class Cesto<T> {
    private T conteudo;

    public void guardar(T objeto){
        this.conteudo = objeto;
    }

    public T pegar(){
        return this.conteudo;    
    }

    public static void main(String[] args) {
        Peixe pe = new Peixe();
        pe.nome = "robalo";
        pe.tamanho = "grande";

        Cesto<Peixe> cestoPeixe = new Cesto<>();
        cestoPeixe.guardar(pe);

        Peixe peixeDaVez = cestoPeixe.pegar();

        System.out.println(peixeDaVez.nome);
        System.out.println(peixeDaVez.tamanho);
    }
}
