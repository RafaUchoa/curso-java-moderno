package Exercicios.S_Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class TestaContato {

    private static String arq = "C:/Git/curso-java-moderno/Exercicios/S_Serialization/agenda.ser";

    private  static void serializarContato(List<Contato> listaContato) throws IOException{
        try(ObjectOutputStream outputstream = new ObjectOutputStream(new FileOutputStream(arq))){
            outputstream.writeObject(listaContato);
            System.out.println("Contatos serializados salvos com sucesso!");
        }
    }

    private static void deserializarContatos() throws IOException, ClassNotFoundException{
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arq))){
           List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();
           for (Contato contato : contatosLidos){
            System.out.println("Nome: " + contato.nome + ", Telefone: " + contato.telefone);
           }
        }
    }

    public static void main(String[] args) {
        Contato conta = new Contato("Uchoa", "123455");
        Contato contb = new Contato("Julia", "3455");
        Contato contc = new Contato("Lolo", "1234");
        
        List<Contato> lstContatos = new ArrayList<>();
        lstContatos.add(conta);
        lstContatos.add(contb);
        lstContatos.add(contc);

        try{
            TestaContato.serializarContato(lstContatos);
            TestaContato.deserializarContatos();
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("Erro ao serializar: " + e.getMessage());
        }
    }
}
