package com.example.newgametest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;




public class Controller
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDraw;

    @FXML
    private Button btnEnd;

    @FXML
    private Button btnPair;

    @FXML
    private Button btnThree;

    @FXML
    private VBox bvRight;

    @FXML
    private GridPane gpLeft;

    @FXML
    private GridPane gpMain;

    @FXML
    private Label lblLeft;

    @FXML
    private TextArea txtAreaBot;

    @FXML
    private TextArea txtAreaTop;

    private EuchreGame euchre;

    @FXML
    void btnDrawOnActionHandler(ActionEvent event) {
        euchre = new EuchreGam

    }

    @FXML
    void btnEndOnActionHandler(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnPairOnActionHandler(ActionEvent event) {

    }

    @FXML
    void btnThreeOnActionHandler(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnDraw != null : "fx:id=\"btnDraw\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnEnd != null : "fx:id=\"btnEnd\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnPair != null : "fx:id=\"btnPair\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnThree != null : "fx:id=\"btnThree\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert bvRight != null : "fx:id=\"bvRight\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert gpLeft != null : "fx:id=\"gpLeft\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert gpMain != null : "fx:id=\"gpMain\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert lblLeft != null : "fx:id=\"lblLeft\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtAreaBot != null : "fx:id=\"txtAreaBot\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtAreaTop != null : "fx:id=\"txtAreaTop\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
