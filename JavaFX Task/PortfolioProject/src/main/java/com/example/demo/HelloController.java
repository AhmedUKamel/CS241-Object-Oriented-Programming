package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class HelloController {
    @FXML
    Button next;
    @FXML
    Button prev;
    @FXML
    ImageView imgv;

    Image img;
    File file;
    String[] paths = {"img (1).jpg", "img (2).jpg", "img (3).jpg", "img (4).jpg", "img (5).jpg", "img (6).jpg", "img (7).jpg", "img (8).jpg"};
    int click = 0;

    @FXML
    private void nextFun(){
        click = (++click) % 8;
        next.setText("Image "+(((click+1)%8)+1));
        prev.setText("Image "+(((click+7)%8)+1));
        file = new File("src/Images/" + paths[click]);
        img = new Image(file.toURI().toString());
        imgv.setImage(img);
    }

    @FXML
    private void prevFun(){
        if(--click<0) click+=8;
        next.setText("Image "+(((click+1)%8)+1));
        prev.setText("Image "+(((click+7)%8)+1));
        file = new File("src/Images/" + paths[click]);
        img = new Image(file.toURI().toString());
        imgv.setImage(img);
    }
}