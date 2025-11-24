package Exercicios.E_Classes;

public class Personagem {
    private String nome;
    private int nivelDePoder;

    public Personagem(String nom, int poder){
        this.nome = nom;
        this.nivelDePoder = poder;
    }

    public void maisPoder(int valor){
        valor += 10;
    }

    public void mudaNomePerson(Personagem per){
        per.nome = "Ateobaldo";
    }

    public static void main(String[] args) {
        Personagem p = new Personagem("Uchoa", 100);

        System.out.println(p.nivelDePoder);
        p.maisPoder(10);
        System.out.println(p.nivelDePoder);

        System.out.println(p.nome);
        p.mudaNomePerson(p);
        System.out.println(p.nome);

    }
}
