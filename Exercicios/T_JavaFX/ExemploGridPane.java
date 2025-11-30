package Exercicios.T_JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class ExemploGridPane extends Application {

    @Override
    public void start(Stage palco){
        Label rotuloNome = new Label("Nome:");
        Label rotuloEmail = new Label("E-Mail:");

        TextField campoNome = new TextField();
        TextField campoEmail= new TextField();

        Button botaoEnviar = new Button("Enviar");

        //Criacao do GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(8); //Espacamento Horizontal entre celulas
        gridPane.setVgap(8); //Espacamento vertical entre celulas
        gridPane.setPadding(new Insets(5)); // Espacamento externo

        //Add itens no gridpane
        gridPane.addRow(0,  rotuloNome, campoNome);
        gridPane.addRow(1,  rotuloEmail, campoEmail);
        gridPane.addRow(2, botaoEnviar);

        //Criacao da cena
        Scene cena = new  Scene(gridPane, 400, 200);

        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
