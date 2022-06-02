module com.example.euclideanargorithm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.euclideanargorithm to javafx.fxml;
    exports com.example.euclideanargorithm;
}