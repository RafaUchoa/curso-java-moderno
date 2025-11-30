package Exercicios.T_JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ExemploControles extends Application {
    
    @Override
    public void start(Stage palco){
        Label label = new Label("Olá sou etiqueta (Label)");
        Button botao = new Button("Clique Aqui");
        TextField campoTexto = new TextField();

        VBox layout = new VBox(label, botao, campoTexto);

        Scene cena = new Scene(layout, 300, 200); // largura 300, altura 200

        palco.setScene(cena);

        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
