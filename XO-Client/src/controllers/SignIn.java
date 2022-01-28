package controllers;

import javafx.scene.shape.*;
import javafx.scene.text.*;
import java.lang.*;
import java.util.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.*;  

public class SignIn extends AnchorPane {

    protected final Label accountQue;
    protected final Rectangle rectangle;
    protected final Button signIn;
    protected final PasswordField passwordField;
    protected final TextField userNameField;
    protected final Label signInHeader;
    protected final Button signUp;

    public SignIn(Stage stage) {

        accountQue = new Label();
        rectangle = new Rectangle();
        signIn = new Button();
        passwordField = new PasswordField();
        userNameField = new TextField();
        signInHeader = new Label();
        signUp = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(483.0);
        setPrefWidth(519.0);
        setStyle("-fx-background-color: linear-gradient(#37077B, #FDB8A5);");

        accountQue.setLayoutX(134.0);
        accountQue.setLayoutY(371.0);
        accountQue.setText("Do not Have Account?");

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(305.0);
        rectangle.setLayoutX(119.0);
        rectangle.setLayoutY(43.0);
        rectangle.setOpacity(0.3);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(295.0);

        signIn.setLayoutX(222.0);
        signIn.setLayoutY(288.0);
        signIn.setMnemonicParsing(false);
        signIn.setPrefHeight(25.0);
        signIn.setPrefWidth(89.0);
        signIn.setStyle("-fx-background-color: #E4A593;");
        signIn.setText("Sign In");

        passwordField.setLayoutX(153.0);
        passwordField.setLayoutY(221.0);
        passwordField.setPrefHeight(25.0);
        passwordField.setPrefWidth(227.0);
        passwordField.setPromptText("Enter Password");

        userNameField.setLayoutX(152.0);
        userNameField.setLayoutY(171.0);
        userNameField.setPrefHeight(25.0);
        userNameField.setPrefWidth(227.0);
        userNameField.setPromptText("Enter Username");

        signInHeader.setAlignment(javafx.geometry.Pos.CENTER);
        signInHeader.setLayoutX(216.0);
        signInHeader.setLayoutY(97.0);
        signInHeader.setText("Sign In");
        signInHeader.setTextFill(javafx.scene.paint.Color.valueOf("#ebbfb3"));
        signInHeader.setFont(new Font("Arial", 25.0));

        signUp.setLayoutX(325.0);
        signUp.setLayoutY(367.0);
        signUp.setMnemonicParsing(false);
        signUp.setPrefHeight(25.0);
        signUp.setPrefWidth(89.0);
        signUp.setStyle("-fx-background-color: #533178;");
        signUp.setText("Sign Up");
        signUp.setTextFill(javafx.scene.paint.Color.WHITE);

        getChildren().add(accountQue);
        getChildren().add(rectangle);
        getChildren().add(signIn);
        getChildren().add(passwordField);
        getChildren().add(userNameField);
        getChildren().add(signInHeader);
        getChildren().add(signUp);



        //Switch scences
        signUp.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                SignUp root = new SignUp(stage);
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
       });
        signIn.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        Home root = new Home(stage);
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
        });


    }
}
