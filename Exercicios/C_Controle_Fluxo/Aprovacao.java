
public class Aprovacao {
    public static void main(String[] args){
        int nota1 = 5;
        int nota2 = 3;

        int media = (nota1 + nota2) / 2;

        String resultado = switch(media){
            case 0,1,2,3,4,5 -> "Reprovado";
            case 6,7,8,9,10 -> "Aprovado";
            default -> "Desconhecido";
        };

        System.out.println(resultado);
    }    
}
