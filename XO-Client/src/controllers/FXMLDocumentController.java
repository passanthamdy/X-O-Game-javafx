/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author aya
 */
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene ;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


/**
 *
 * @author aya
 */
public class FXMLDocumentController   {
    private Stage stage;
    private Scene scene;
    private Parent parent;
    
    
    
    
    public void switchToScenelogin (ActionEvent event) throws IOException
    {
        
       Parent root = FXMLLoader.load(getClass().getResource("/views/Login.fxml"));
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();            
                
      
    }
    public void switchToSignUp(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("/views/SignUp.fxml"));
           stage = (Stage)((Node)event.getSource()).getScene().getWindow();
           scene = new Scene(root);
           stage.setScene(scene);
           stage.show();
      }
    
    
    
}
