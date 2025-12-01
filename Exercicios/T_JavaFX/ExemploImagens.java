package Exercicios.T_JavaFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ExemploImagens extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco){
        String caminhoImagem = "file:///C:/Git/curso-java-moderno/Exercicios/T_JavaFX/imagens/flor.jpg";
        Image imagem = new Image(caminhoImagem);
        ImageView imageView = new ImageView(imagem);
    
        //Ajustando o tamanho da imagem
        imageView.setFitWidth(613); //Largura em pixels
        imageView.setFitHeight(613); //altura em pixels
        imageView.setPreserveRatio(true); //Mantem proporcao na imagem

        VBox layout = new VBox(imageView);
        Scene cena = new Scene(layout, 700, 700);

        palco.setScene(cena);
        palco.show();

    }
}