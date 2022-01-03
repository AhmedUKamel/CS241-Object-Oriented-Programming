module com.example.shapesproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shapesproject to javafx.fxml;
    exports com.example.shapesproject;
}