package Exercicios.G_Heranca;

class Veiculo {
    
    public void acelerar(){
        System.out.println("Acelerando");
    }
}

class Carro extends Veiculo{

    public void acelerar(){
        System.out.println("Carro Acelerando");
        super.acelerar();
    }
}