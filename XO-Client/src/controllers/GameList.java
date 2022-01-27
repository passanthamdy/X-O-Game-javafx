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

public class GameList extends AnchorPane {

    protected final Button logOut;
    //protected final ImageView imageView;
    protected final Label userName;
    protected final Rectangle rectangle;
    protected final Label score;
    protected final Button home;
    protected final TableView gameListTable;
    protected final TableColumn player1;
    protected final TableColumn player2;
    protected final TableColumn winner;
    protected final TableColumn rePlay;

    public GameList(Stage stage) {

        logOut = new Button();
        //imageView = new ImageView();
        userName = new Label();
        rectangle = new Rectangle();
        score = new Label();
        home = new Button();
        gameListTable = new TableView();
        player1 = new TableColumn();
        player2 = new TableColumn();
        winner = new TableColumn();
        rePlay = new TableColumn();

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

        /*imageView.setFitHeight(47.0);
        imageView.setFitWidth(47.0);
        imageView.setLayoutX(29.0);
        imageView.setLayoutY(13.0);
        imageView.setImage(new Image(getClass().getResource("../../../profile.png").toExternalForm()));*/

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

        home.setLayoutX(440.0);
        home.setLayoutY(61.0);
        home.setMnemonicParsing(false);
        home.setPrefHeight(25.0);
        home.setPrefWidth(62.0);
        home.setStyle("-fx-background-color: #E4A593; -fx-text-fill: #ffffff; -fx-background-radius: 20px; -fx-font-weight: bold;");
        home.setText("Home");

        gameListTable.setLayoutX(56.0);
        gameListTable.setLayoutY(129.0);
        gameListTable.setPrefHeight(324.0);
        gameListTable.setPrefWidth(416.0);
        gameListTable.setStyle("-fx-background-color: none;");

        player1.setPrefWidth(118.0);
        player1.setText("Player1");

        player2.setPrefWidth(129.0);
        player2.setText("Player2");

        winner.setPrefWidth(65.0);
        winner.setText("Winner");

        rePlay.setPrefWidth(103.0);
        rePlay.setText("Replay");

        getChildren().add(logOut);
        //getChildren().add(imageView);
        getChildren().add(userName);
        getChildren().add(rectangle);
        getChildren().add(score);
        getChildren().add(home);
        gameListTable.getColumns().add(player1);
        gameListTable.getColumns().add(player2);
        gameListTable.getColumns().add(winner);
        gameListTable.getColumns().add(rePlay);
        getChildren().add(gameListTable);


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
        home.setOnAction(new EventHandler<ActionEvent>(){
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
