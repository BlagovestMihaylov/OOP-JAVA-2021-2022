package com.example.gui;

import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import java.util.ResourceBundle;

import generator.CipherGenerator;
import generator.Result;
import generator.Wrapper;
import interfaces.Cipherable;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGenerate;

    @FXML
    private Button btnQuit;

    @FXML
    private Button btnSubset;

    @FXML
    private TextField txtSeed;

    @FXML
    private TextField txtSize;

    @FXML
    void btnGenerateOnActionHandler(ActionEvent event)
    {
        buttonResponseIfFieldsAreNotEmpty();

    }

    private void buttonResponseIfFieldsAreNotEmpty()
    {
        if (Objects.equals(txtSize.getText(), "") || Objects.equals(txtSeed.getText(), ""))
        {
            checkEmpty();
        } else
        {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Random subsequence of letters A-Z");
            int size = tryToSetSize();
            if (size > 100) size = 100;
            int seed = tryToSetSeed();

            if (size == Integer.MIN_VALUE || seed == Integer.MIN_VALUE)
            {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setTitle("Please write only numbers");
                a.setHeaderText("Please write numbers");
                a.setContentText("Please write numbers in the fields");
                a.show();
            } else
            {
                Wrapper wrapper = new Wrapper(size);
                Cipherable cipherable = wrapper.makeFixedSelection();
                Result result = CipherGenerator.countDistinct(cipherable, seed);
                alert.setHeaderText("Count distinct characters of " + seed);
                alert.setContentText(Arrays.toString(result.getChars()) + "\nResult: " + result.getData());
                alert.show();
            }
        }
    }

    @FXML
    void btnQuitOnActionHandler(ActionEvent event)
    {
        Platform.exit();

    }

    @FXML
    void btnSubsetOnActionHandler(ActionEvent event)
    {
        buttonResponseIfFieldsAreNotEmpty();
    }

    @FXML
    void initialize()
    {
        assert btnGenerate != null : "fx:id=\"btnGenerate\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnSubset != null : "fx:id=\"btnSubset\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtSeed != null : "fx:id=\"txtSeed\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtSize != null : "fx:id=\"txtSize\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

    private void checkEmpty()
    {
        if (Objects.equals(txtSize.getText(), ""))
        {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Empty size field");
            a.setHeaderText("Please write number");
            a.setContentText("Please write number in size field");
            a.show();
        }
        if (Objects.equals(txtSeed.getText(), ""))
        {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Empty seed field");
            a.setHeaderText("Please write number");
            a.setContentText("Please write number in seed field");
            a.show();
        }
    }

    private int tryToSetSize()
    {
        try
        {
            return Integer.parseInt(txtSize.getText());
        } catch (RuntimeException ignored)
        {

        }

        return Integer.MIN_VALUE;
    }

    private int tryToSetSeed()
    {
        try
        {
            return Integer.parseInt(txtSeed.getText());

        } catch (RuntimeException ignored)
        {

        }
        return Integer.MIN_VALUE;
    }


}
