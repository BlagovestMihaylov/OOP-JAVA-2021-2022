package task2;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnClearAll;

    @FXML
    private Button btnCloseProgram;

    @FXML
    private Button btnComa;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnDoubleZero;

    @FXML
    private Button btnEight;

    @FXML
    private Button btnEquals;

    @FXML
    private Button btnFive;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnMemory;

    @FXML
    private Button btnMemoryClear;

    @FXML
    private Button btnMemoryMinus;

    @FXML
    private Button btnMemoryPlus;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnMultiplication;

    @FXML
    private Button btnNine;

    @FXML
    private Button btnOne;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnSeven;

    @FXML
    private Button btnSix;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnZero;

    @FXML
    private TextField txtPrompt;

    @FXML
    private TextField txtSavedNumbers;

    private String current = "";
    private String last = "";
    private String result = "";
    private String command = "";
    private String history = "";
    private String memory = "";
    private boolean commandOn = false;

    @FXML
    void btnZeroOnActionHandler(ActionEvent event)
    {
        add("0");
    }

    @FXML
    void btnOneOnActionHandler(ActionEvent event)
    {
        add("1");
    }

    @FXML
    void btnTwoOnActionHandler(ActionEvent event)
    {
        add("2");
    }

    @FXML
    void btnThreeOnActionHandler(ActionEvent event)
    {
        add("3");
    }

    @FXML
    void btnFourOnActionHandler(ActionEvent event)
    {
        add("4");
    }

    @FXML
    void btnFiveOnActionHandler(ActionEvent event)
    {
        add("5");
    }

    @FXML
    void btnSixOnActionHandler(ActionEvent event)
    {
        add("6");
    }

    @FXML
    void btnSevenOnActionHandler(ActionEvent event)
    {
        add("7");
    }


    @FXML
    void btnEightOnActionHandler(ActionEvent event)
    {
        add("8");
    }

    @FXML
    void btnNineOnActionHandler(ActionEvent event)
    {
        add("9");
    }

    @FXML
    void btnPlusOnActionHandler(ActionEvent event)
    {
        command = "+";
        commandOn = true;
    }

    @FXML
    void btnMinusOnActionHandler(ActionEvent event)
    {
        command = "-";
        commandOn = true;
    }

    @FXML
    void btnMultiplicationOnActionHandler(ActionEvent event)
    {
        command = "*";
        commandOn = true;
    }

    @FXML
    void btnDivideOnActionHandler(ActionEvent event)
    {
        command = "/";
        commandOn = true;
    }

    @FXML
    void btnEqualsOnActionHandler(ActionEvent event)
    {
        switch (command)
        {
            case "+" -> {
                result = sum(last, current);
                txtSavedNumbers.setText(last + " + " + current + " = " + result);
                txtPrompt.setText(result);
            }
            case "-" -> {
                result = subtract(last, current);
                txtSavedNumbers.setText(last + " - " + current + " = " + result);
                txtPrompt.setText(result);
            }
            case "/" -> {
                result = division(last, current);
                txtSavedNumbers.setText(last + " / " + current + " = " + result);
                txtPrompt.setText(result);
            }
            case "*" -> {
                result = multiplication(last, current);
                txtSavedNumbers.setText(last + " * " + current + " = " + result);
                txtPrompt.setText(result);
            }
        }
        commandOn = false;
    }

    @FXML
    void btnClearOnActionHandler(ActionEvent event)
    {
        current = "";
    }

    @FXML
    void btnClearAllOnActionHandler(ActionEvent event)
    {
        result = "";
        current = "";
        last = "";
        commandOn = false;
    }

    @FXML
    void btnComaOnActionHandler(ActionEvent event)
    {
        add(".");
    }

    @FXML
    void btnDoubleZeroOnActionHandler(ActionEvent event)
    {
        add(".00");
    }

    @FXML
    void btnMemoryOnActionHandler(ActionEvent event)
    {
        memory = txtPrompt.getText();
    }

    @FXML
    void btnMemoryClearOnActionHandler(ActionEvent event)
    {
        memory = "";
    }

    @FXML
    void btnMemoryMinusOnActionHandler(ActionEvent event)
    {
        memory = txtPrompt.getText();
        command = "-";
        result = subtract(last, current);
        txtSavedNumbers.setText(last + " + " + current + " = " + result);
        txtPrompt.setText(result);
    }

    @FXML
    void btnMemoryPlusOnActionHandler(ActionEvent event)
    {
        memory = txtPrompt.getText();
        command = "+";
        result = sum(last, current);
        txtSavedNumbers.setText(last + " + " + current + " = " + result);
        txtPrompt.setText(result);
    }

    @FXML
    void btnCloseProgramOnActionHandler(ActionEvent event)
    {
        Platform.exit();
    }

    @FXML
    void initialize()
    {
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnClearAll != null : "fx:id=\"btnClearAll\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnCloseProgram != null : "fx:id=\"btnCloseProgram\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnComa != null : "fx:id=\"btnComa\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnDivide != null : "fx:id=\"btnDivide\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnDoubleZero != null : "fx:id=\"btnDoubleZero\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnEight != null : "fx:id=\"btnEight\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnEquals != null : "fx:id=\"btnEquals\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnFive != null : "fx:id=\"btnFive\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnFour != null : "fx:id=\"btnFour\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnMemory != null : "fx:id=\"btnMemory\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnMemoryClear != null : "fx:id=\"btnMemoryClear\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnMemoryMinus != null : "fx:id=\"btnMemoryMinus\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnMemoryPlus != null : "fx:id=\"btnMemoryPlus\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnMinus != null : "fx:id=\"btnMinus\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnMultiplication != null : "fx:id=\"btnMultiplication\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnNine != null : "fx:id=\"btnNine\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnOne != null : "fx:id=\"btnOne\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnPlus != null : "fx:id=\"btnPlus\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnSeven != null : "fx:id=\"btnSeven\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnSix != null : "fx:id=\"btnSix\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnThree != null : "fx:id=\"btnThree\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnTwo != null : "fx:id=\"btnTwo\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnZero != null : "fx:id=\"btnZero\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtPrompt != null : "fx:id=\"txtPrompt\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtSavedNumbers != null : "fx:id=\"txtSavedNumbers\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

    private String sum(String s1, String s2)
    {
        BigDecimal bigDecimal1 = new BigDecimal(s1);
        BigDecimal bigDecimal2 = new BigDecimal(s2);
        return bigDecimal1.add(bigDecimal2).toString();
    }

    private String subtract(String s1, String s2)
    {
        BigDecimal bigDecimal1 = new BigDecimal(s1);
        BigDecimal bigDecimal2 = new BigDecimal(s2);
        return bigDecimal1.subtract(bigDecimal2).toString();
    }

    private String division(String s1, String s2)
    {
        BigDecimal bigDecimal1 = new BigDecimal(s1);
        BigDecimal bigDecimal2 = new BigDecimal(s2);
        return bigDecimal1.divide(bigDecimal2).toString();
    }

    private String multiplication(String s1, String s2)
    {
        BigDecimal bigDecimal1 = new BigDecimal(s1);
        BigDecimal bigDecimal2 = new BigDecimal(s2);
        return bigDecimal1.multiply(bigDecimal2).toString();
    }

    public void updateTextField(String number)
    {
        txtPrompt.setText(number);
    }

    private void add(String number)
    {
        if (commandOn)
        {
            current += number;
            updateTextField(current);
        } else
        {
            last += number;
            updateTextField(last);
        }
    }

}
