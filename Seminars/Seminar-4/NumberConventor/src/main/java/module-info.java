module com.example.numberconventor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numberconventor to javafx.fxml;
    exports com.example.numberconventor;
}