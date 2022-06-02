package com.example.task2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class SquareShapeSpiral extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        Group group = new Group();
        Scene scene = new Scene(group, 300, 300);
        stage.setTitle("Square Shaped Spiral!");

        double width = scene.getWidth();
        double height = scene.getWidth();

        double widthCenter = width / 2;
        double heightCenter = height / 2;

        for (int i = 0; i < 5 ; i++)
        {
            Line line1 = new Line(widthCenter + (20 * i), heightCenter - (20 * i), widthCenter + (20 * i), heightCenter + 20 + (20 * i));
            group.getChildren().add(line1);
            line1.setStroke(Color.RED);
            line1.setStrokeWidth(2.5);  //на 2.5 са само да може да се виждат по-добре
            Line line2 = new Line(widthCenter + (20 * i), heightCenter + 20 + (20 * i), widthCenter - 20 - (20 * i), heightCenter + 20 + (20 * i));
            group.getChildren().add(line2);
            line2.setStroke(Color.RED);
            line2.setStrokeWidth(2.5);
            Line line3 = new Line(widthCenter - 20 - (20 * i), heightCenter + 20 + (20 * i), widthCenter - 20 - (20 * i), heightCenter - 20 - (20 * i));
            group.getChildren().add(line3);
            line3.setStroke(Color.RED);
            line3.setStrokeWidth(2.5);
            Line line4 = new Line(widthCenter - 20 - (20 * i), heightCenter - 20 - (20 * i), widthCenter + 20 + (20 * i), heightCenter - 20 - (20 * i));
            group.getChildren().add(line4);
            line4.setStroke(Color.RED);
            line4.setStrokeWidth(2.5);
        }



        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}