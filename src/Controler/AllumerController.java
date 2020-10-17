/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Util.SHOW;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author ckk
 */
public class AllumerController implements Initializable {
    @FXML
    private Pane panelLoad;

    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      this.hidePanel();
       this.showSplash();
        
        
    }
    
     void hidePanel(){
        this.panelLoad.setVisible(false);
    }
    
     
     void showPanel(){
        this.panelLoad.setVisible(true);
    }
    void showSplash(){
        
        
        
        FadeTransition fade=new FadeTransition(Duration.seconds(3),panelLoad);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.setCycleCount(1);
        
        
        
        FadeTransition f=new FadeTransition(Duration.seconds(4),panelLoad);
        
        fade.play();
        
        fade.setOnFinished(e->{
        this.showPanel();
        f.play();
        f.setOnFinished(ee->{
           
            SHOW d=new SHOW();
            d.show(panelLoad, "Login");
        });
        });
        
    
}
   
}
