public class ContinueBreak {

    public static void main(String[] args){
        int codigoDeSaida = 9;
        int codigoCarteirinha = 4;

        for(int i = 0; i < 10; i++){
            
            if (codigoCarteirinha == codigoDeSaida){
                break;
            }

            if (codigoCarteirinha == 3 | codigoCarteirinha == 7| codigoCarteirinha == 10){
                System.out.println("Código "+ codigoCarteirinha +" aceito!");
                continue;
            }
        }

        System.out.println("Fim do programa!");
    }
}
