package com.example.task1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Locale;
import java.util.Optional;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Calendar extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        // Locale bgLocale = new Locale("bg", "BG");
        //Locale.setDefault(bgLocale);
        Locale.setDefault(Locale.US);
        Group group = new Group();
        Scene scene = new Scene(group, 600, 300);
        stage.setTitle("Calendar");
        int year = getYear();
        int month = getMonth();


        SimpleDateFormat monthDate = new SimpleDateFormat("MMMM");
        String monthName = monthDate.format(month);

        int startDayOfMonth = 0;

        LocalDate date = LocalDate.of(year, month, 1);
        switch (date.getDayOfWeek())        //да видя кой ден е всяко първо число от месеца
        {
            case MONDAY -> startDayOfMonth = 1;
            case TUESDAY -> startDayOfMonth = 2;
            case WEDNESDAY -> startDayOfMonth = 3;
            case THURSDAY -> startDayOfMonth = 4;
            case FRIDAY -> startDayOfMonth = 5;
            case SATURDAY -> startDayOfMonth = 6;
            case SUNDAY -> startDayOfMonth = 7;
            default -> startDayOfMonth = 0;
        }


        int spaces = startDayOfMonth - 1; //броя на разстоянията, след наместване се получи това


        String[] months = {"",  //първия празен, за да може Януари да ми е първия месец
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"};


        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //всеки месец по колко дни има


        if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && month == 2) days[month] = 29;  //проверка за високосни




        Text text = new Text();
        String tempText = ""; //може би най-глупавия начин да се пише на Form App, използвам го като буфер за текста


        tempText += "                 " + months[month] + " " + year + "\n";

        tempText += " Mon  Tue  Wed  Thu  Fri  Sat  Sun\n";

        for (int i = 0; i < spaces; i++)
        {
            tempText += "        ";       //всички спейсове са нагласени след опитите
        }

        for (int i = 1; i <= days[month]; i++)
        {
            if (i > 9) tempText += "  " + i + "  ";
            else tempText += "   " + i + "   ";
            if (((i + spaces) % 7 == 0) || (i == days[month])) tempText += "\n";
        }

        tempText += "\n";
        text.setText(tempText); //използване на буфера
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
        text.setX(20);
        text.setY(35);

        
        group.getChildren().add(text);

        String calendarName = "Calendar";
        stage.setTitle(calendarName);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args)
    {
        launch();
    }

    private void showErrorAlert(String errorName)
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setContentText(errorName);
        alert.showAndWait();
    }

    private int getMonth()
    {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Prompt");
        dialog.setContentText("Enter desired month");

        int x = 0;
        boolean invalid = true;
        do
        {
            Optional<String> userInput = dialog.showAndWait();
            if (userInput.isPresent())
            {
                x = Integer.parseInt(userInput.get());
                if (x >= 0 && x <= 12)
                {
                    invalid = false;
                } else
                {
                    showErrorAlert("Month number out of bounds");
                }
            } else
            {
                invalid = false;
            }

        } while (invalid);

        return x;
    }

    private int getYear()
    {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Prompt");
        dialog.setContentText("Enter desired year");
        int x = 0;
        boolean invalid = true;
        do
        {
            Optional<String> userInput = dialog.showAndWait();
            if (userInput.isPresent())
            {
                x = Integer.parseInt(userInput.get());
                if (x >= 0)
                {
                    invalid = false;
                } else
                {
                    showErrorAlert("Month number out of bounds");
                }
            } else
            {
                invalid = false;
            }

        } while (invalid);
        return x;
    }
}