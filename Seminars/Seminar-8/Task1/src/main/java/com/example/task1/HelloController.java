package com.example.task1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRegister;

    @FXML
    private Label lblConfirmPassword;

    @FXML
    private Label lblConfirmPasswordError;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblEmailError;

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblPasswordError;

    @FXML
    private Label lblPhoneNumber;

    @FXML
    private Label lblPhoneNumberError;

    @FXML
    private Label lblUserName;

    @FXML
    private Label lblUsernameError;

    @FXML
    private PasswordField pwdConformPassword;

    @FXML
    private PasswordField pwdPassword;

    @FXML
    private Tooltip tltEmail;

    @FXML
    private Tooltip tltPhoneNumber;

    @FXML
    private Tooltip tltUsername;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnRegisterOnActionHandler(ActionEvent event)
    {
        boolean isFormValid = validateForm();

        if (isFormValid)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Info");
            alert.setContentText("You registered");
            alert.showAndWait();

        }
    }

    @FXML
    void initialize()
    {
        assert btnRegister != null : "fx:id=\"btnRegister\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert lblConfirmPassword != null : "fx:id=\"lblConfirmPassword\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert lblConfirmPasswordError != null : "fx:id=\"lblConfirmPasswordError\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert lblEmail != null : "fx:id=\"lblEmail\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert lblEmailError != null : "fx:id=\"lblEmailError\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert lblPassword != null : "fx:id=\"lblPassword\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert lblPasswordError != null : "fx:id=\"lblPasswordError\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert lblPhoneNumber != null : "fx:id=\"lblPhoneNumber\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert lblPhoneNumberError != null : "fx:id=\"lblPhoneNumberError\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert lblUserName != null : "fx:id=\"lblUserName\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert lblUsernameError != null : "fx:id=\"lblUsernameError\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert pwdConformPassword != null : "fx:id=\"pwdConformPassword\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert pwdPassword != null : "fx:id=\"pwdPassword\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tltEmail != null : "fx:id=\"tltEmail\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tltPhoneNumber != null : "fx:id=\"tltPhoneNumber\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tltUsername != null : "fx:id=\"tltUsername\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtPhoneNumber != null : "fx:id=\"txtPhoneNumber\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtUsername != null : "fx:id=\"txtUsername\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

    private boolean validateForm()
    {
        boolean userNameRequired = validateRequired(txtUsername, lblUsernameError);
        boolean phoneNumberRequired = validateRequired(txtPhoneNumber, lblPhoneNumberError);
        boolean emailRequired = validateRequired(txtEmail, lblEmailError);
        boolean passwordRequired = validateRequired(pwdPassword, lblPasswordError);
        boolean confirmPasswordRequired = validateRequired(pwdConformPassword, lblConfirmPasswordError);
        boolean userNamePattern = validateUserNamePattern();
        boolean phoneNumberPattern = validatePhoneNumberPattern();
        boolean emailPattern = validateEmail();
        return userNameRequired
                && phoneNumberRequired
                && emailRequired
                && passwordRequired
                && confirmPasswordRequired
                && userNamePattern
                && phoneNumberPattern
                && emailPattern;

    }

    private boolean validateRequired(TextField textField, Label errorLabel)
    {
        String fieldValue = textField.getText();
        if (fieldValue.equals(""))
        {
            errorLabel.setText("Required");
            return false;
        }
        errorLabel.setText("");
        return true;

    }

    private boolean validateUserNamePattern()
    {
        String userNameValue = txtUsername.getText();

        if (userNameValue.matches("[a-zA-Z]{2,}"))
            return true;

        return false;
    }

    private boolean validatePhoneNumberPattern()
    {
        if (lblPhoneNumberError.getText().length() > 0)
            return false;

        String phoneNumberValue = txtPhoneNumber.getText();
        if(phoneNumberValue.matches("\\(\\d[4]\\) \\(\\d[7]\\)"))
            return true;

        lblPhoneNumberError.setText("Invalid");
        return false;
    }

    private boolean validateEmail()
    {
        if(lblEmailError.getText().length() > 0)
            return false;

        String emailValue = txtPhoneNumber.getText();
        if(emailValue.matches("(\\w+-?[.]?)+@(\\w+-?)+[.][a-zA-Z]{2,4}"))
            return  true;

        lblEmailError.setText("Invalid");
        return false;
    }

}