module com.example.task1c {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.example.task1a;


    opens com.example.task1c to javafx.fxml;
    exports com.example.task1c;
}