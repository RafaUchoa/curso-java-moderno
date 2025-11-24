package Exercicios.E_Classes;

public class PessoaTeste {
    public static void main(String[] args){
        Pessoa p = new Pessoa();

        p.setIdade(44);    
        int idade = p.getIdade();

        p.setEndereco("Santo albano");
        String endereco = p.getEndereco();

        p.setTelefone("99999999");
        String telefone = p.getTelefone();

        System.out.println(idade);
        System.out.println(endereco);
        System.out.println(telefone);
    }
}
