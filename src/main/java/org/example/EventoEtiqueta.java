package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventoEtiqueta extends Application {

    @Override
    public void start(Stage stage) {

        Label etiqueta = new Label("Estado: apagado");

        Button boton = new Button("Cambiar estado");
        boton.setMaxWidth(Double.MAX_VALUE);

        // boolean[] en vez de boolean porque las lambdas no pueden
        // modificar variables locales directamente — este es el truco habitual
        boolean[] encendido = {false};

        boton.setOnAction(event -> {
            // Alternamos el estado cada vez que se pulsa
            encendido[0] = !encendido[0];
            if (encendido[0]) {
                etiqueta.setText("Estado: encendido");
                etiqueta.setStyle("-fx-text-fill: seagreen; -fx-font-weight: bold;");
            } else {
                etiqueta.setText("Estado: apagado");
                etiqueta.setStyle("-fx-text-fill: tomato; -fx-font-weight: bold;");
            }
        });

        VBox root = new VBox(10, etiqueta, boton);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 250, 100);
        stage.setTitle("Ejercicio 17 - Cambiar etiqueta");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}