module com.example.hom5_72084_zad2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens task2 to javafx.fxml;
    exports task2;
}