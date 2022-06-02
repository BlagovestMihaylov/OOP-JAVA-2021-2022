package com.example.task1c;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

import com.example.task1a.*;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 320, 240);

        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            double x = random.nextInt(101);
            double y = random.nextInt(101);
            double width = 1 + random.nextInt(200);
            double height = 1 + random.nextInt(200);
            Rectangle rectangle = new Rectangle(new Point(new double[]{x,y}), width, height);
            rectangle.draw(group);
        }

        stage.setTitle("Geometry");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}