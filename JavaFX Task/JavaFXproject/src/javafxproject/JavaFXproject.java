/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author ahmed
 */
public class JavaFXproject extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        // My desigh
        Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
        
        // My Scene
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        
        // My Stage
        stage.setScene(scene);
        stage.setTitle("Registeration Form");
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
