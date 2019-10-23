/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball4;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


/**
 *
 * @author vlawrence6491
 */

public class Baseball4 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException{
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        Scene scene;
        scene = new Scene(root);
        
        primaryStage.setTitle("Baseball");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
