/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Util.SHOW;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author ckk
 */
public class MenuController implements Initializable {
    @FXML
    private BorderPane eze;
     public String defaultStyle = "-fx-border-width: 0px 0px 3px 0px;"
            + "-fx-border-color:#000";

   public String activeStyle = "-fx-border-width: 0px 0px 3px 0px;"
            + "-fx-border-color:#eb5555;";
    @FXML
    private Button m1;
    @FXML
    private Button m2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clavier(KeyEvent event) {
        System.err.println(event.getSource());
    }

    @FXML
    private void menu1(ActionEvent event) {
       active1();
    }

    @FXML
    private void menu2(ActionEvent event) {
          active2();
     
    }
    
    void active1(){
           FXMLLoader fxmlLoader = new FXMLLoader();
        try {
            fxmlLoader.load(getClass().getResource("/view/Login.fxml").openStream());

        } catch (IOException e) {
            System.err.println("erreur "  + e);
            e.printStackTrace();
        }
        AnchorPane AnchorRoot = fxmlLoader.getRoot();
        eze.getChildren().clear();
        eze.getChildren().add(AnchorRoot);
        m1.setStyle(activeStyle);
        m2.setStyle(defaultStyle);
        
    }
    
     void active2(){
           FXMLLoader fxmlLoader = new FXMLLoader();
        try {
            fxmlLoader.load(getClass().getResource("/view/allumer.fxml").openStream());

        } catch (IOException e) {
            System.err.println("erreur "  + e);
            e.printStackTrace();
        }
        AnchorPane AnchorRoot = fxmlLoader.getRoot();
        eze.getChildren().clear();
        eze.getChildren().add(AnchorRoot);
        m2.setStyle(activeStyle);
        m1.setStyle(defaultStyle);
        
    }
    
}
