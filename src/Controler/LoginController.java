/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author ckk
 */
public class LoginController implements Initializable {
    @FXML
    private JFXButton con;
    @FXML
    private ImageView i1;
    @FXML
    private ImageView i2;
    Image ii=new Image("Image/contact.png");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        i1.setImage(ii);
    }    

    @FXML
    private void onpressed(ActionEvent event) {
        
        
    }
    
}
