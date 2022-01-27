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

public class ServerHome extends AnchorPane {

    protected final Rectangle rectangle;
    protected final TableView tableView;
    protected final TableColumn tableColumn;
    protected final TableColumn tableColumn0;
    protected final TableColumn tableColumn1;
    protected final Label label;
    protected final Button button;
    protected final Button button0;
    protected final Label label0;

    public ServerHome() {

        rectangle = new Rectangle();
        tableView = new TableView();
        tableColumn = new TableColumn();
        tableColumn0 = new TableColumn();
        tableColumn1 = new TableColumn();
        label = new Label();
        button = new Button();
        button0 = new Button();
        label0 = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(483.0);
        setPrefWidth(519.0);
        setStyle("-fx-background-color: linear-gradient(#37077B, #FDB8A5);");

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(483.0);
        rectangle.setOpacity(0.29);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(169.0);

        tableView.setLayoutX(173.0);
        tableView.setLayoutY(90.0);
        tableView.setPrefHeight(383.0);
        tableView.setPrefWidth(325.0);
        tableView.setStyle("-fx-background-color: none;");

        tableColumn.setPrefWidth(179.0);
        tableColumn.setText("Name");

        tableColumn0.setPrefWidth(73.0);
        tableColumn0.setText("Score");

        tableColumn1.setPrefWidth(72.0);
        tableColumn1.setText("Status");

        label.setLayoutX(174.0);
        label.setLayoutY(44.0);
        label.setText("List Of Players");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#e4a593"));
        label.setFont(new Font("Arial", 22.0));

        button.setLayoutX(22.0);
        button.setLayoutY(218.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(48.0);
        button.setPrefWidth(125.0);
        button.setStyle("-fx-background-color: #E4A593;");
        button.setText("Stop Service");

        button0.setLayoutX(22.0);
        button0.setLayoutY(136.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(48.0);
        button0.setPrefWidth(125.0);
        button0.setStyle("-fx-background-color: #E4A593;");
        button0.setText("Open Service");

        label0.setLayoutX(22.0);
        label0.setLayoutY(98.0);
        label0.setText("Server Control");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#e4a593"));
        label0.setFont(new Font("Arial", 18.0));

        getChildren().add(rectangle);
        tableView.getColumns().add(tableColumn);
        tableView.getColumns().add(tableColumn0);
        tableView.getColumns().add(tableColumn1);
        getChildren().add(tableView);
        getChildren().add(label);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(label0);

    }
}
