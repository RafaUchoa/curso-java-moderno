
// Exercicio 106
public class Produto{
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nom, double prec, int qtd){
        this.nome =nom;
        this.preco = prec;
        this.quantidadeEmEstoque = qtd;
    }

    public static void main(String[] args){
        Produto p = new Produto("Carro", 87000.00, 10);

        System.out.println("Nome: " + p.nome);
        System.out.println("Preço: " + p.preco);
        System.out.println("Valor: " + p.quantidadeEmEstoque);
    }
}