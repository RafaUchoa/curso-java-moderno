package Exercicios.E_Classes;

 // Execício 114
class SalaDeAula {
    public static int totalAlunos = 31;

    public static void adicionaAluno(int qtd){
        totalAlunos += qtd;
    }

    public static void GetTotalAlunos(){
        System.out.println("Total de alunos: " + totalAlunos);
    }
}
