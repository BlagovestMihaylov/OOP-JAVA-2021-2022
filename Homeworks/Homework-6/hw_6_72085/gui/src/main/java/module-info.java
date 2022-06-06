module com.example.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires providers;
    requires services;


    opens com.example.gui to javafx.fxml;
    exports com.example.gui;
}