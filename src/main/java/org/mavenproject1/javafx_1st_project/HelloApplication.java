package org.mavenproject1.javafx_1st_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage=primaryStage;
        stage.setTitle(" "+" Lamborghini Motors");
        primaryStage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource(fxml))));
       stage.getScene().setRoot(root);
    }

    public static void main(String[] args) {
        launch();
    }
}