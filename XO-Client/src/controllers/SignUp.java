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

public class SignUp extends AnchorPane {

    protected final Label accountQue;// label
    protected final Rectangle rectangle;
    protected final Button signUp;//button
    protected final PasswordField passwordConfirm;//password
    protected final PasswordField password;//password0
    protected final TextField userName;
    protected final Label signUpHeader;//label0
    protected final Button signIn;//button0

    public SignUp(Stage stage) {

        accountQue = new Label();
        rectangle = new Rectangle();
        signUp = new Button();
        passwordConfirm = new PasswordField();
        password = new PasswordField();
        userName = new TextField();
        signUpHeader = new Label();
        signIn = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(483.0);
        setPrefWidth(519.0);
        setStyle("-fx-background-color: linear-gradient(#37077B, #FDB8A5);");

        accountQue.setLayoutX(134.0);
        accountQue.setLayoutY(401.0);
        accountQue.setText("Do Already Have Account?");

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(344.0);
        rectangle.setLayoutX(119.0);
        rectangle.setLayoutY(43.0);
        rectangle.setOpacity(0.3);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(295.0);

        signUp.setLayoutX(229.0);
        signUp.setLayoutY(333.0);
        signUp.setMnemonicParsing(false);
        signUp.setPrefHeight(25.0);
        signUp.setPrefWidth(89.0);
        signUp.setStyle("-fx-background-color: #E4A593;");
        signUp.setText("Sign Up");

        passwordConfirm.setLayoutX(154.0);
        passwordConfirm.setLayoutY(264.0);
        passwordConfirm.setPrefHeight(25.0);
        passwordConfirm.setPrefWidth(227.0);
        passwordConfirm.setPromptText("Confirm Password");

        password.setLayoutX(153.0);
        password.setLayoutY(211.0);
        password.setPrefHeight(25.0);
        password.setPrefWidth(227.0);
        password.setPromptText("Enter Password");

        userName.setLayoutX(152.0);
        userName.setLayoutY(161.0);
        userName.setPrefHeight(25.0);
        userName.setPrefWidth(227.0);
        userName.setPromptText("Enter Username");

        signUpHeader.setAlignment(javafx.geometry.Pos.CENTER);
        signUpHeader.setLayoutX(216.0);
        signUpHeader.setLayoutY(97.0);
        signUpHeader.setText("Sign Up");
        signUpHeader.setTextFill(javafx.scene.paint.Color.valueOf("#ebbfb3"));
        signUpHeader.setFont(new Font("Arial", 25.0));

        signIn.setLayoutX(325.0);
        signIn.setLayoutY(397.0);
        signIn.setMnemonicParsing(false);
        signIn.setPrefHeight(25.0);
        signIn.setPrefWidth(89.0);
        signIn.setStyle("-fx-background-color: #533178;");
        signIn.setText("Sign In");
        signIn.setTextFill(javafx.scene.paint.Color.WHITE);

        getChildren().add(accountQue);
        getChildren().add(rectangle);
        getChildren().add(signUp);
        getChildren().add(passwordConfirm);
        getChildren().add(password);
        getChildren().add(userName);
        getChildren().add(signUpHeader);
        getChildren().add(signIn);


        //switch scences
        signIn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                SignIn root = new SignIn(stage);
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
       });
        signUp.setOnAction(new EventHandler<ActionEvent>(){
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
