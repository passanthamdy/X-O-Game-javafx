package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;
public class MainApp extends Application {
	public static void main(String[] args) {
			launch(args);
	}
       /*@Override
        public void init() throws Exception{
            
        }*/
	@Override
	public void start(Stage stage) throws Exception {
		SignIn root = new SignIn(stage);
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.show();
	    
	}

}
