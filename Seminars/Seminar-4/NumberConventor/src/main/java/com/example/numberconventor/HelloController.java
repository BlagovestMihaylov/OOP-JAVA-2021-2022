package com.example.numberconventor;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class HelloController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bntBinary;

    @FXML
    private Button bntDecimal;

    @FXML
    private Button bntHex;

    @FXML
    private MenuItem minBinary;

    @FXML
    private Menu mniConvert;

    @FXML
    private MenuItem mniDecimal;

    @FXML
    private MenuItem mniHex;

    @FXML
    private Menu mniQuit;

    @FXML
    private TextField txtBinary;

    @FXML
    private TextField txtDecimal;

    @FXML
    private TextField txtHex;

    @FXML
    void bntBinaryOnActionHandler(ActionEvent event)
    {


    }

    @FXML
    void bntDecimalOnActionHandler(ActionEvent event)
    {
        convertDecimal();

    }

    @FXML
    void bntHexOnActionHandler(ActionEvent event)
    {

    }

    @FXML
    void mniBinaryOnActionHandler(ActionEvent event)
    {

    }

    @FXML
    void mniConvertOnActionHadnler(ActionEvent event)
    {

    }

    @FXML
    void mniDecimalOnActionHadnler(ActionEvent event)
    {
        convertDecimal();
    }

    @FXML
    void mniHexlOnActionHadnler(ActionEvent event)
    {

    }

    @FXML
    void mniQuitOnActionHandler(ActionEvent event)
    {

    }

    @FXML
    void txtBinaryOnActionHadnler(ActionEvent event)
    {

    }

    @FXML
    void txtDecimalOnActionHadnler(ActionEvent event)
    {
        convertDecimal();
    }

    @FXML
    void txtHexOnActionHadnler(ActionEvent event)
    {

    }

    @FXML
    void initialize()
    {
        assert bntBinary != null : "fx:id=\"bntBinary\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert bntDecimal != null : "fx:id=\"bntDecimal\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert bntHex != null : "fx:id=\"bntHex\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert minBinary != null : "fx:id=\"minBinary\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert mniConvert != null : "fx:id=\"mniConvert\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert mniDecimal != null : "fx:id=\"mniDecimal\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert mniHex != null : "fx:id=\"mniHex\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert mniQuit != null : "fx:id=\"mniQuit\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtBinary != null : "fx:id=\"txtBinary\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtDecimal != null : "fx:id=\"txtDecimal\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtHex != null : "fx:id=\"txtHex\" was not injected: check your FXML file 'hello-view.fxml'.";

    }



    private void convertDecimal()
    {
        String decimalText = txtDecimal.getText();
        int decimal = Integer.parseInt(decimalText);
        txtHex.setText(Integer.toHexString(decimal).toUpperCase());
        txtBinary.setText((Integer.toBinaryString(decimal)));
    }

}
