package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EventoValidacion extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));

        Label lblNombre = new Label("Nombre:");
        TextField campNombre = new TextField();
        campNombre.setPromptText("Tu nombre");
        grid.add(lblNombre, 0, 0);
        grid.add(campNombre, 1, 0);

        Label lblEmail = new Label("Email:");
        TextField campEmail = new TextField();
        campEmail.setPromptText("Tu email");
        grid.add(lblEmail, 0, 1);
        grid.add(campEmail, 1, 1);

        Button boton = new Button("Enviar");
        boton.setMaxWidth(Double.MAX_VALUE);
        grid.add(boton, 1, 2);

        boton.setOnAction(event -> {
            String nombre = campNombre.getText();
            String email  = campEmail.getText();

            if (nombre.isEmpty() || email.isEmpty()) {
                // Alert es una ventana emergente — AlertType.ERROR le da el icono de error
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de validación");
                alert.setHeaderText("Campos vacíos");
                alert.setContentText("Rellena todos los campos antes de enviar");
                // showAndWait() muestra el diálogo y espera a que el usuario lo cierre
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Éxito");
                alert.setHeaderText(null); // sin cabecera
                alert.setContentText("Formulario enviado correctamente");
                alert.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 320, 150);
        stage.setTitle("Ejercicio 16 - Validación con Alert");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}