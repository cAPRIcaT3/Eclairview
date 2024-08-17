package com.eclairview.economiccalendaroverlay;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.InputStream;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Load the icon using InputStream
        InputStream iconStream = getClass().getResourceAsStream("/icon/app-icon.png");
        if (iconStream == null) {
            System.err.println("Resource not found! Please check the path.");
        } else {
            Image icon = new Image(iconStream);
            primaryStage.getIcons().add(icon);
        }

        // Create a Label to display some text
        Label label = new Label("EclairView - Economic Calendar");

        // Set up the layout in a StackPane
        StackPane root = new StackPane(label);

        // Create a Scene with the layout
        Scene scene = new Scene(root, 400, 200);

        // Set the title of the window (optional, but useful for debugging)
        primaryStage.setTitle("EclairView");

        // Set the scene on the stage
        primaryStage.setScene(scene);

        // Show the stage (window)
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
