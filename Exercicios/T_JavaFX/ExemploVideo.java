package Exercicios.T_JavaFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class ExemploVideo extends Application{

    @Override
    public void start(Stage palcoPrincipal){
        String urlVideo = "file:///C:/Git/curso-java-moderno/Exercicios/T_JavaFX/videos/video_sample_a.mp4";

        Media media = new Media(urlVideo);

        MediaPlayer mediaPlayer = new MediaPlayer(media);

        MediaView mediaView = new MediaView(mediaPlayer);

        HBox hbox = new HBox();
        hbox.getChildren().add(mediaView);

        Scene scene = new Scene(hbox, 800, 600);

        palcoPrincipal.setTitle("Exemplo de Video");
        palcoPrincipal.setScene(scene);
        palcoPrincipal.show();

        mediaPlayer.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


//Compilacao
//javac --module-path "%PATH_TO_FX%" --add-modules javafx.controls,javafx.media Exercicios\T_JavaFX\ExemploVideo.java

//Execucao
//java --module-path "%PATH_TO_FX%" --add-modules javafx.controls,javafx.media Exercicios.T_JavaFX.ExemploVideo