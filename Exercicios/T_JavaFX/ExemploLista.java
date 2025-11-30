package Exercicios.T_JavaFX;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class ExemploLista extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco){
        ObservableList<String> itens;
        itens = FXCollections.observableArrayList("Itm 1", "Item 2", "Item 3");

        ListView<String> listview = new ListView<>(itens);

        VBox layout = new VBox(listview);

        Scene cena = new Scene(layout, 300, 200);

        palco.setScene(cena);

        palco.show();
    }
}
