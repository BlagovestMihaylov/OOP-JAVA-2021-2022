module com.example.week8zad1registrationform {
    requires javafx.controls;
    requires javafx.fxml;


    opens task3 to javafx.fxml;
    exports task3;
}