public class DiasNoMes{
    public static void main(String[] args){
        
        String mes = "Novembro"; 

        int diasNoMes = switch(mes){
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> 31;
            case "Abril", "Junho", "Setembro", "Novembro" -> 30;
            case "Fevereiro" -> 28;
            default -> -1;
        };
        
        System.out.println(diasNoMes);
    }
}