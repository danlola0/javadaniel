/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author ckk
 */
public class SHOW {
    
    
     public void show(Node node, String path){
        path="/view/"+path+".fxml";
        Stage stage;
        stage=(Stage) node.getScene().getWindow();
        try {
             Parent root = FXMLLoader.load(getClass().getResource(path));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setX(150);
            stage.setY(10);//     stage.initStyle(StageStyle.UNDECORATED);

            stage.show();
        } catch (Exception e) {
            System.err.println("failed to load "+path+" reason: "+e);
        }
        
    }
     
     
 public void Show(BorderPane content ,String path) {
        path="/view/"+path+".fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();
        try {
            fxmlLoader.load(getClass().getResource(path).openStream());

        } catch (IOException e) {
            System.err.println("erreur " + path + " " + e);
            e.printStackTrace();
        }
        AnchorPane AnchorRoot = fxmlLoader.getRoot();
        content.getChildren().clear();
        content.getChildren().add(AnchorRoot);
    }
 
  public void Show2(BorderPane content ,String path) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        try {
            fxmlLoader.load(getClass().getResource(path).openStream());

        } catch (IOException e) {
            System.err.println("erreur " + path + " " + e);
            e.printStackTrace();
        }
        AnchorPane AnchorRoot = fxmlLoader.getRoot();
        content.getChildren().clear();
        content.getChildren().add(AnchorRoot);
    }
    
}
