
public class Frequencia {
    public static void main(String[] args){
        int nota1 = 5;
        int nota2 = 10;
        int frequencia = 75;
        String resultado = "";

        int media = (nota1 + nota2) / 2;

        String mediaStr = switch(media){
            case 0,1,2,3,4,5 -> "Abaixo";
            case 6,7,8,9,10 -> "Acima";
            default -> "Desconhecido";
        };

        resultado = mediaStr == "Acima" & frequencia >= 75 ? "Passou" : "Não Passou"; 

        System.out.println(resultado);
    }    
}
