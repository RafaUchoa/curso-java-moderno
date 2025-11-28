package Exercicios.K_Abstratas;

public class Retangulo extends FiguraGeometrica {
    public void calcularArea(){
        System.out.println("Area calculada");
    }

    public void calcularPerimetro(){
        System.out.println("Perimetro calculado");
    }

    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        ret.calcularArea();
        ret.calcularPerimetro();
    }
}


