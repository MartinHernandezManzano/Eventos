package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventoMultiple extends Application {

    @Override
    public void start(Stage stage) {

        Button boton1 = new Button("Botón 1");
        Button boton2 = new Button("Botón 2");
        Button boton3 = new Button("Botón 3");
        Button boton4 = new Button("Botón 4");

        // Cada botón tiene su propio manejador con su propio mensaje
        boton1.setOnAction(event -> System.out.println("Pulsado el botón 1"));
        boton2.setOnAction(event -> System.out.println("Pulsado el botón 2"));
        boton3.setOnAction(event -> System.out.println("Pulsado el botón 3"));
        boton4.setOnAction(event -> System.out.println("Pulsado el botón 4"));

        // Todos al mismo ancho para que quede uniforme
        for (Button b : new Button[]{boton1, boton2, boton3, boton4}) {
            b.setMaxWidth(Double.MAX_VALUE);
        }

        VBox root = new VBox(10, boton1, boton2, boton3, boton4);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 250, 180);
        stage.setTitle("Ejercicio 18 - Múltiples eventos");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}