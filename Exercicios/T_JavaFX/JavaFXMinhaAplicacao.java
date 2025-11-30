package Exercicios.T_JavaFX;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXMinhaAplicacao extends Application {
    
    @Override
    public void start(Stage palco){
        palco.setTitle("Meu Primeiro Palco");

        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

//Como compilar:
//javac --module-path "c:\java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls Exercicios\T_JavaFX\JavaFXMinhaAplicacao.java
// OU USAR A VARIAVE DE AMBIENTE:
//javac --module-path "%PATH_TO_FX%" --add-modules javafx.controls Exercicios\T_JavaFX\JavaFXMinhaAplicacao.java

//Como executar:
//java --module-path "c:\java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls Exercicios.T_JavaFX.JavaFXMinhaAplicacao
// OU USAR A VARIAVE DE AMBIENTE:
//java --module-path "%PATH_TO_FX%" --add-modules javafx.controls Exercicios.T_JavaFX.JavaFXMinhaAplicacao


//Documentação JavaFx:
//https://openjfx.io/javadoc/22/index.html