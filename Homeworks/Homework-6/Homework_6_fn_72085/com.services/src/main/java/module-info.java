module com.example.services {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.services to javafx.fxml;
    exports com.example.services;
}