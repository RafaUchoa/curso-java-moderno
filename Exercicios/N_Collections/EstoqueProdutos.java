package Exercicios.N_Collections;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Integer, Integer> mpEstoque = new HashMap<>();
    
    public void addProduto(Integer cod, Integer val){
        mpEstoque.put(cod, val);
    }

    public int getQuantidade(Integer cod){
        return mpEstoque.get(cod);
    }

    public void removerQuantidade(Integer cod, Integer qtd){
        Integer qtdAtual = mpEstoque.get(cod);
        Integer qtdNova = qtdAtual - qtd;
        this.addProduto(cod, qtdNova);
    }

    public static void main(String[] args) {
        EstoqueProdutos est = new EstoqueProdutos();

        est.addProduto(123, 100);
        est.addProduto(123, 400);

        System.out.println("Total" + est.getQuantidade(123));

        est.removerQuantidade(123, 7);

        System.out.println("Total" + est.getQuantidade(123));

    }
}
