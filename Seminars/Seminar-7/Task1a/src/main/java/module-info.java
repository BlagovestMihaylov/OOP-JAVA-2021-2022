module com.example.task1a {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task1a to javafx.fxml;
    exports com.example.task1a;
}