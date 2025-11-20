public class PrecedenciaOperadoresAtribuicao {

    public static void main(String[] args){
        int numero = 5;
        int incremento = 0;
        int decremento = 0;

        System.out.println("Valores iniciais -> incremento: " + incremento + ", Numero: " + numero);

        incremento = ++numero;
        System.out.println("incremento = ++numero");
        System.out.println("Incremento: " + incremento + ", Numero: " + numero);

        incremento = numero++;
        System.out.println("incremento = numero++");
        System.out.println("Incremento: " + incremento + ", Numero: " + numero);

        decremento = --numero;
        System.out.println("decremento = --numero");
        System.out.println("Decremento: " + decremento + ", Numero: " + numero);

        decremento = numero--;
        System.out.println("decremento = numero--");
        System.out.println("Decremento: " + decremento + ", Numero: " + numero);
    }
}
