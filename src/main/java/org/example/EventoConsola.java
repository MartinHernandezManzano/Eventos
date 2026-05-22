package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventoConsola extends Application {

    @Override
    public void start(Stage stage) {

        Button boton = new Button("Pulsa aquí");
        boton.setMaxWidth(Double.MAX_VALUE);

        // setOnAction registra el manejador del evento ActionEvent
        // cada vez que se pulsa el botón se ejecuta esta lambda
        // el parámetro 'event' es el ActionEvent — aquí no lo necesitamos
        boton.setOnAction(event -> System.out.println("¡Botón pulsado!"));

        VBox root = new VBox(10, boton);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 250, 100);
        stage.setTitle("Ejercicio 15 - Evento consola");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}