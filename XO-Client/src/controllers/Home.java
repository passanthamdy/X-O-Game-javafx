package controllers;

import javafx.geometry.*;
import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import java.lang.*;
import java.util.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.*;  

public class Home extends AnchorPane {

    protected final Button logOut;//button 
    protected final ImageView profile;
    protected final Label userName;//label
    protected final Rectangle rectangle;
    protected final Label score;//label0
    protected final Label label1;//label1
    protected final Label label2;//label2
    protected final Label label3;//label3
    protected final Label label4;//label4
    protected final Button playVsPC;//button0
    protected final Button playOnline;//button1
    protected final Button recordedGames;//button2
    protected final Button playersList;//button3

    public Home(Stage stage) {

        logOut = new Button();
        profile = new ImageView();
        userName = new Label();
        rectangle = new Rectangle();
        score = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        playVsPC = new Button();
        playOnline = new Button();
        recordedGames = new Button();
        playersList = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(483.0);
        setPrefWidth(519.0);
        setStyle("-fx-background-color: linear-gradient(#37077B, #FDB8A5);");

        logOut.setAlignment(javafx.geometry.Pos.TOP_RIGHT);
        logOut.setLayoutX(437.0);
        logOut.setLayoutY(24.0);
        logOut.setMnemonicParsing(false);
        logOut.setStyle("-fx-background-color: #E4A593; -fx-text-fill: #ffffff; -fx-background-radius: 20px; -fx-font-weight: bold;");
        logOut.setText("Log Out");
        logOut.setOpaqueInsets(new Insets(0.0));

        /*profile.setFitHeight(47.0);
        profile.setFitWidth(47.0);
        profile.setLayoutX(29.0);
        profile.setLayoutY(13.0);
        profile.setImage(new Image(getClass().getResource("../../../profile.png").toExternalForm()));*/

        userName.setLayoutX(24.0);
        userName.setLayoutY(69.0);
        userName.setStyle("-fx-font-weight: bold;");
        userName.setText("User_Name");
        userName.setTextFill(javafx.scene.paint.Color.WHITE);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(25.0);
        rectangle.setLayoutX(14.0);
        rectangle.setLayoutY(94.0);
        rectangle.setOpacity(0.3);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setStrokeWidth(0.0);
        rectangle.setWidth(83.0);

        score.setAlignment(javafx.geometry.Pos.CENTER);
        score.setLayoutX(31.0);
        score.setLayoutY(99.0);
        score.setText("10 Points");
        score.setTextFill(javafx.scene.paint.Color.WHITE);
        score.setFont(new Font("Arial Bold", 11.0));
        score.setOpaqueInsets(new Insets(0.0));
        score.setCursor(Cursor.DEFAULT);

        label1.setAlignment(javafx.geometry.Pos.CENTER);
        label1.setLayoutX(232.0);
        label1.setLayoutY(76.0);
        label1.setText("X");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#e4a593"));
        label1.setFont(new Font("Arial Bold", 48.0));

        label2.setLayoutX(265.0);
        label2.setLayoutY(79.0);
        label2.setText("O");
        label2.setTextFill(javafx.scene.paint.Color.WHITE);
        label2.setFont(new Font("Arial Bold", 48.0));

        label3.setLayoutX(234.0);
        label3.setLayoutY(127.0);
        label3.setText("T");
        label3.setTextFill(javafx.scene.paint.Color.WHITE);
        label3.setFont(new Font("Arial Bold", 48.0));

        label4.setLayoutX(265.0);
        label4.setLayoutY(127.0);
        label4.setText("O");
        label4.setTextFill(javafx.scene.paint.Color.valueOf("#e4a593"));
        label4.setFont(new Font("Arial Bold", 48.0));

        playVsPC.setLayoutX(172.0);
        playVsPC.setLayoutY(195.0);
        playVsPC.setMnemonicParsing(false);
        playVsPC.setPrefHeight(47.0);
        playVsPC.setPrefWidth(194.0);
        playVsPC.setStyle("-fx-background-color: #E4A593;");
        playVsPC.setText("Play vs PC");
        playVsPC.setTextFill(javafx.scene.paint.Color.WHITE);
        playVsPC.setFont(new Font("Arial Bold", 18.0));

        playOnline.setLayoutX(172.0);
        playOnline.setLayoutY(255.0);
        playOnline.setMnemonicParsing(false);
        playOnline.setPrefHeight(47.0);
        playOnline.setPrefWidth(194.0);
        playOnline.setStyle("-fx-background-color: #533178;");
        playOnline.setText("Play Online");
        playOnline.setTextFill(javafx.scene.paint.Color.WHITE);
        playOnline.setFont(new Font("Arial Bold", 18.0));

        recordedGames.setLayoutX(172.0);
        recordedGames.setLayoutY(315.0);
        recordedGames.setMnemonicParsing(false);
        recordedGames.setPrefHeight(47.0);
        recordedGames.setPrefWidth(194.0);
        recordedGames.setStyle("-fx-background-color: #3D0D7C;");
        recordedGames.setText("Recorded Games");
        recordedGames.setTextFill(javafx.scene.paint.Color.WHITE);
        recordedGames.setFont(new Font("Arial Bold", 18.0));

        playersList.setLayoutX(173.0);
        playersList.setLayoutY(377.0);
        playersList.setMnemonicParsing(false);
        playersList.setPrefHeight(47.0);
        playersList.setPrefWidth(194.0);
        playersList.setStyle("-fx-background-color: #533178;");
        playersList.setText("List of Players");
        playersList.setTextFill(javafx.scene.paint.Color.WHITE);
        playersList.setFont(new Font("Arial Bold", 18.0));

        getChildren().add(logOut);
        //getChildren().add(profile);
        getChildren().add(userName);
        getChildren().add(rectangle);
        getChildren().add(score);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(label3);
        getChildren().add(label4);
        getChildren().add(playVsPC);
        getChildren().add(playOnline);
        getChildren().add(recordedGames);
        getChildren().add(playersList);


        //Switch scences
        logOut.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        SignIn root = new SignIn(stage);
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
        });
        recordedGames.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        GameList root = new GameList(stage);
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
        });
        playersList.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        PlayersList root = new PlayersList(stage);
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
        });

    }
}
