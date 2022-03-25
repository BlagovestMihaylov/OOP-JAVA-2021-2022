package com.example.task1;

import javafx.application.Application;

import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Optional;

public class Geometry extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        Group group = new Group();
        Scene scene = new Scene(group, 300, 300);

        double centerX = scene.getWidth() / 2;
        double centerY = scene.getHeight() / 2;
        double radius = Math.min(scene.getHeight(), scene.getWidth()) / 3;

        Circle circle = new Circle(centerX, centerY, radius);
        circle.setFill(null);
        circle.setStroke(Color.BLUE);
        group.getChildren().add(circle);

        double lineX = getLineX(scene.getWidth());
        Line line = new Line(lineX, 0, lineX, scene.getHeight());
        line.setStroke(Color.RED);
        group.getChildren().add(line);

        double chSquare = radius * radius - (centerX - lineX) * (centerX - lineX);

        if (chSquare >= 0)
        {
            double firstCrossPointY = centerY - Math.sqrt(chSquare);
            drawSmallCircleWithText(lineX, firstCrossPointY, group);

            if (chSquare > 0)
            {
                double secondCrossPointY = centerY + Math.sqrt(chSquare);
                drawSmallCircleWithText(lineX, secondCrossPointY, group);
            }
        } else
        {
            showWarningAlert();
            Platform.exit();
        }

        stage.setTitle("Draw Circle with Line");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }


    private void drawSmallCircleWithText(double x, double y, Group group)
    {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        Circle circle = new Circle(x, y, 5);
        Text text = new Text(x + 10, y, "(" + numberFormat.format(x) + ", " + numberFormat.format(y) + " )");
        text.setStroke(Color.GREEN);
        group.getChildren().add(circle);
        group.getChildren().add(text);
    }

    private void showWarningAlert()
    {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("WARNING");
        alert.setContentText("NO INTERSECTION");
        alert.showAndWait();
    }

    private void showErrorAlert()
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setContentText("OUT OF BOUNDS");
        alert.showAndWait();
    }

    private double getLineX(double width)
    {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Prompt");
        dialog.setContentText("Enter x for line AB");

        double x = 0;
        boolean invalid = true;
        do
        {
            Optional<String> userInput = dialog.showAndWait();
            if (userInput.isPresent())
            {
                x = Double.parseDouble(userInput.get());
                if (x >= 0 && x <= width)
                {
                    invalid = false;
                } else
                {
                    showErrorAlert();
                }
            } else
            {
                invalid = false;
            }

        } while (invalid);

        return x;
    }

}