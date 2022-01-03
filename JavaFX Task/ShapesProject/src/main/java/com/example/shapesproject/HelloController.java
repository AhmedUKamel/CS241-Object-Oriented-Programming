package com.example.shapesproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ComboBox combobox;
    @FXML
    private Pane pane;

    @FXML
    private void comboFunction(){
        switch(combobox.getSelectionModel().getSelectedIndex()){
            case 0:
                Rectangle rectangle = new Rectangle();
                rectangle.setHeight(200);
                rectangle.setWidth(300);
                rectangle.setY(75);
                rectangle.setX(15);
                rectangle.setFill(Color.web("6C3483"));
                pane.getChildren().clear();
                pane.getChildren().add(rectangle);
                break;
            case 1:
                Circle circle = new Circle();
                circle.setRadius(100);
                circle.setLayoutX(165);
                circle.setLayoutY(175);
                circle.setFill(Color.web("EC7063"));
                pane.getChildren().clear();
                pane.getChildren().add(circle);
                break;
            case 2:
                Rectangle square = new Rectangle();
                square.setHeight(200);
                square.setWidth(200);
                square.setY(75);
                square.setX(65);
                square.setFill(Color.web("5D6D7E"));
                pane.getChildren().clear();
                pane.getChildren().add(square);
                break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        combobox.getItems().add("Rectangle");
        combobox.getItems().add("Circle");
        combobox.getItems().add("Square");
    }
}