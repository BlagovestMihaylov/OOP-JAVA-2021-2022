package com.example.task2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

import java.io.IOException;

public class Drawing extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        Group group = new Group(); // Create a layout Panel
        Scene scene = new Scene(group, 400, 400);// Create the Scene
        double width = scene.getWidth(); // total width of the scene
        double height = scene.getHeight(); // total width of the scene
        for (int i = 0; i<= width; i+=10)
        {
            Line line = new Line(i, 0, width, i);   //making the first curve
            line.setStroke(Color.BLUE);                 //choosing the color of the line
            line.setStrokeWidth(0.5);                   //choosing the thickness of the line
            group.getChildren().add(line);              //adding the line to the group
        }

        //the next 3 curves are the same with the first, just with different coordinates
        //all will be drawn with different colors, just to see them apart more easily

        for (int i = 0; i<= width; i+=10)
        {
            Line line = new Line(0, i, i, height);
            line.setStroke(Color.PURPLE);
            line.setStrokeWidth(0.5);
            group.getChildren().add(line);
        }

        for (int i = 0; i<= width; i+=10)
        {
            Line line = new Line(height-i, 0, 0,i );
            line.setStroke(Color.GREEN);
            line.setStrokeWidth(0.5);
            group.getChildren().add(line);
        }

        for (int i = 0; i<= width; i+=10)
        {
            Line line = new Line(height,i, height-i,width );
            line.setStroke(Color.RED);
            line.setStrokeWidth(0.5);
            group.getChildren().add(line);
        }
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Canvas Demo"); //changing the name as in the homework
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args)
    {
        launch();
    }
}