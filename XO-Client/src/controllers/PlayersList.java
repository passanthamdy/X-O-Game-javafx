package controllers;
import java.sql.*;
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
import models.Player;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.collections.ListChangeListener;
import javafx.collections.FXCollections;
import javafx.util.Callback;
public class PlayersList extends AnchorPane {

    protected final Button logOut;
    //protected final ImageView imageView;
    protected final Label userName;
    protected final Rectangle rectangle;
    protected final Label score;
    protected final Button home;
    protected final TableView<Player> playersList;
    protected final TableColumn playerName;
    protected final TableColumn playerScore;
    protected final TableColumn playerStatus;
    protected final TableColumn<Player, Void> challenge;
    public PlayersList(Stage stage) {

        logOut = new Button();
        //imageView = new ImageView();
        userName = new Label();
        rectangle = new Rectangle();
        score = new Label();
        home = new Button();
        playersList = new TableView<>();
        playerName = new TableColumn();
        playerScore = new TableColumn();
        playerStatus = new TableColumn();
        challenge = new TableColumn();

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

        playersList.setLayoutX(56.0);
        playersList.setLayoutY(129.0);
        playersList.setPrefHeight(324.0);
        playersList.setPrefWidth(416.0);
        playersList.setStyle("-fx-background-color: none;");

        playerName.setPrefWidth(148.0);
        playerName.setText("Name");

        playerScore.setPrefWidth(77.0);
        playerScore.setText("Score");

        playerStatus.setPrefWidth(87.0);
        playerStatus.setText("Status");

        challenge.setPrefWidth(103.0);
        challenge.setText("Request");

        getChildren().add(logOut);
        //getChildren().add(imageView);
        getChildren().add(userName);
        getChildren().add(rectangle);
        getChildren().add(score);
        getChildren().add(home);
        
        
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
        /*
        Table content
        */
        ObservableList<Player> players = FXCollections.observableArrayList();
        
        players.add(new Player(1,"Abdorahman", 7, "offline"));
        players.add(new Player(2,"Fatma", 5, "online"));
        
        

        playerName.setCellValueFactory(new PropertyValueFactory<Player, String>("username"));
        playerScore.setCellValueFactory(new PropertyValueFactory<Player, Integer>("score"));
        playerStatus.setCellValueFactory(new PropertyValueFactory<Player,String>("status"));
       

        playersList.setItems(players);
        
        playersList.getColumns().add(playerName);
        playersList.getColumns().add(playerScore);
        playersList.getColumns().add(playerStatus);
        getChildren().add(playersList);
        



        

        Callback<TableColumn<Player, Void>, TableCell<Player, Void>> cellFactory = new Callback<TableColumn<Player, Void>, TableCell<Player, Void>>() {
            @Override
            public TableCell<Player, Void> call(final TableColumn<Player, Void> param) {
                final TableCell<Player, Void> cell = new TableCell<Player, Void>() {

                    private final Button request = new Button("Challenge");
               

                    {
                        request.setOnAction((ActionEvent event) -> {
                            Player playerData = getTableView().getItems().get(getIndex());
                            int user = playerData.getPlayer_id();
                            System.out.println("username: " + user);
                        });
                    }

                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(request);
                        }
                    }
                };
                return cell;
            }
        };
    
    challenge.setCellFactory(cellFactory);
    playersList.getColumns().add(challenge);
    }
}
