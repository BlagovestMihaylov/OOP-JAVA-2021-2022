module com.example.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires service;
    requires providers;


    opens com.example.gui to javafx.fxml;
    exports com.example.gui;
}