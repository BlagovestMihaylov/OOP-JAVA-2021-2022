package com.example.gui;

import java.net.URL;
import java.util.ResourceBundle;

import generator.Wrapper;
import interfaces.Cipherable;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnQuit;

    @FXML
    private Button btnRandom;

    @FXML
    private Button btnSubset;

    @FXML
    private TextField txtSeed;

    @FXML
    private TextField txtSize;

    @FXML
    void btnQuitOnActionHandler(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnRandomOnActionHandler(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Random subsequence of letters A-Z");
        int size = Integer.parseInt(txtSize.getText());
        int seed = Integer.parseInt(txtSeed.getText());
        Wrapper wrapper = new Wrapper(size);
        Cipherable cipherable = wrapper.makeFixedRandom();

        alert.setTitle(cipherable.getSecretChars(seed).toString());


    }

    @FXML
    void btnSubsetOnActionHandler(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnRandom != null : "fx:id=\"btnRandom\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnSubset != null : "fx:id=\"btnSubset\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtSeed != null : "fx:id=\"txtSeed\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtSize != null : "fx:id=\"txtSize\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
