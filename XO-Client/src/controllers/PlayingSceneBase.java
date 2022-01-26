package controllers;

import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.image.*;
import javafx.scene.paint.*;
import javafx.scene.web.*;
import java.lang.*;
import java.util.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public abstract class PlayingSceneBase extends AnchorPane {

    protected final Group group;
    protected final Button button;
    protected final Button button0;
    protected final Group group0;
    protected final Circle circle;
    protected final Label label;
    protected final Group group1;
    protected final Label label0;
    protected final Label label1;
    protected final Group group2;
    protected final Circle circle0;
    protected final Label label2;
    protected final Group group3;
    protected final Label label3;
    protected final Label label4;
    protected final Group group4;
    protected final Rectangle rectangle;
    protected final Button button1;
    protected final Button button2;
    protected final Separator separator;
    protected final Separator separator0;
    protected final Separator separator1;
    protected final Separator separator2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final Button button8;
    protected final Button button9;
    protected final Group group5;
    protected final Label label5;
    protected final Label label6;
    protected final Label label7;
    protected final Label label8;

    public PlayingSceneBase() {

        group = new Group();
        button = new Button();
        button0 = new Button();
        group0 = new Group();
        circle = new Circle();
        label = new Label();
        group1 = new Group();
        label0 = new Label();
        label1 = new Label();
        group2 = new Group();
        circle0 = new Circle();
        label2 = new Label();
        group3 = new Group();
        label3 = new Label();
        label4 = new Label();
        group4 = new Group();
        rectangle = new Rectangle();
        button1 = new Button();
        button2 = new Button();
        separator = new Separator();
        separator0 = new Separator();
        separator1 = new Separator();
        separator2 = new Separator();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        button8 = new Button();
        button9 = new Button();
        group5 = new Group();
        label5 = new Label();
        label6 = new Label();
        label7 = new Label();
        label8 = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(800.0);
        setScaleShape(false);
        setStyle("-fx-background-color: linear-gradient(#37077B, #FDB8A5);");

        button.setLayoutX(18.0);
        button.setLayoutY(17.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(47.0);
        button.setPrefWidth(117.0);
        button.setStyle("-fx-background-color: #E4A593; -fx-background-radius: 20px;");
        button.setText("Home");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("System Bold", 15.0));

        button0.setLayoutX(18.0);
        button0.setLayoutY(80.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(47.0);
        button0.setPrefWidth(117.0);
        button0.setStyle("-fx-background-color: #E4A593; -fx-background-radius: 20px;");
        button0.setText("Log out");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setFont(new Font("System Bold", 15.0));

        group0.setLayoutX(21.0);

        circle.setFill(javafx.scene.paint.Color.WHITE);
        circle.setLayoutX(132.0);
        circle.setLayoutY(273.0);
        circle.setRadius(79.0);
        circle.setStroke(javafx.scene.paint.Color.valueOf("#e4a593"));
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle.setStrokeWidth(15.0);

        label.setLayoutX(105.0);
        label.setLayoutY(214.0);
        label.setText("X");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#e4a593"));
        label.setFont(new Font("System Bold", 80.0));

        group1.setLayoutX(21.0);

        label0.setLayoutX(22.0);
        label0.setLayoutY(358.0);
        label0.setStyle("-fx-background-color: #e4a593;");
        label0.setText("Player1_Name");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label0.setTextFill(javafx.scene.paint.Color.WHITE);
        label0.setFont(new Font("System Bold", 34.0));

        label1.setLayoutX(84.0);
        label1.setLayoutY(408.0);
        label1.setText("50 Points");
        label1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label1.setTextFill(javafx.scene.paint.Color.WHITE);
        label1.setFont(new Font("System Bold", 24.0));

        group2.setLayoutX(516.0);

        circle0.setFill(javafx.scene.paint.Color.WHITE);
        circle0.setLayoutX(128.0);
        circle0.setLayoutY(273.0);
        circle0.setRadius(79.0);
        circle0.setStroke(javafx.scene.paint.Color.valueOf("#5b3379"));
        circle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle0.setStrokeWidth(15.0);

        label2.setLayoutX(98.0);
        label2.setLayoutY(214.0);
        label2.setText("O");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#5b3379"));
        label2.setFont(new Font("System Bold", 80.0));

        group3.setLayoutX(508.0);

        label3.setLayoutX(22.0);
        label3.setLayoutY(358.0);
        label3.setStyle("-fx-background-color: #5b3379;");
        label3.setText("Player2_Name");
        label3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label3.setTextFill(javafx.scene.paint.Color.WHITE);
        label3.setFont(new Font("System Bold", 34.0));

        label4.setLayoutX(84.0);
        label4.setLayoutY(408.0);
        label4.setText("50 Points");
        label4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label4.setTextFill(javafx.scene.paint.Color.WHITE);
        label4.setFont(new Font("System Bold", 24.0));

        group4.setLayoutX(-18.0);
        group4.setLayoutY(-35.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#2626267a"));
        rectangle.setHeight(319.0);
        rectangle.setLayoutX(175.0);
        rectangle.setLayoutY(502.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(487.0);

        button1.setLayoutX(176.0);
        button1.setLayoutY(608.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(104.0);
        button1.setPrefWidth(161.0);
        button1.setStyle("-fx-background-color: transparent;");
        button1.setText("O");
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setTextFill(javafx.scene.paint.Color.valueOf("#5b3379"));
        button1.setFont(new Font("System Bold", 48.0));

        button2.setLayoutX(176.0);
        button2.setLayoutY(502.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(104.0);
        button2.setPrefWidth(161.0);
        button2.setStyle("-fx-background-color: transparent;");
        button2.setText("X");
        button2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button2.setTextFill(javafx.scene.paint.Color.valueOf("#e4a593"));
        button2.setTextOverrun(javafx.scene.control.OverrunStyle.CENTER_ELLIPSIS);
        button2.setFont(new Font("System Bold", 48.0));

        separator.setLayoutX(176.0);
        separator.setLayoutY(605.0);
        separator.setPrefHeight(0.0);
        separator.setPrefWidth(486.0);
        separator.setStyle("-fx-background-color: white;");

        separator0.setLayoutX(176.0);
        separator0.setLayoutY(711.0);
        separator0.setPrefHeight(0.0);
        separator0.setPrefWidth(486.0);
        separator0.setStyle("-fx-background-color: white;");

        separator1.setLayoutX(337.0);
        separator1.setLayoutY(503.0);
        separator1.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator1.setPrefHeight(316.0);
        separator1.setPrefWidth(0.0);
        separator1.setStyle("-fx-background-color: white;");

        separator2.setLayoutX(498.0);
        separator2.setLayoutY(502.0);
        separator2.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator2.setPrefHeight(316.0);
        separator2.setPrefWidth(0.0);
        separator2.setStyle("-fx-background-color: white;");

        button3.setLayoutX(340.0);
        button3.setLayoutY(502.0);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(104.0);
        button3.setPrefWidth(161.0);
        button3.setStyle("-fx-background-color: transparent;");

        button4.setLayoutX(340.0);
        button4.setLayoutY(608.0);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(104.0);
        button4.setPrefWidth(161.0);
        button4.setStyle("-fx-background-color: transparent;");
        button4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button5.setLayoutX(339.0);
        button5.setLayoutY(714.0);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(104.0);
        button5.setPrefWidth(161.0);
        button5.setStyle("-fx-background-color: transparent;");

        button6.setLayoutX(501.0);
        button6.setLayoutY(502.0);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(104.0);
        button6.setPrefWidth(161.0);
        button6.setStyle("-fx-background-color: transparent;");

        button7.setLayoutX(501.0);
        button7.setLayoutY(608.0);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(104.0);
        button7.setPrefWidth(161.0);
        button7.setStyle("-fx-background-color: transparent;");

        button8.setLayoutX(501.0);
        button8.setLayoutY(714.0);
        button8.setMnemonicParsing(false);
        button8.setPrefHeight(104.0);
        button8.setPrefWidth(161.0);
        button8.setStyle("-fx-background-color: transparent;");

        button9.setLayoutX(176.0);
        button9.setLayoutY(714.0);
        button9.setMnemonicParsing(false);
        button9.setPrefHeight(104.0);
        button9.setPrefWidth(161.0);
        button9.setStyle("-fx-background-color: transparent;");
        button9.setText("X");
        button9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button9.setTextFill(javafx.scene.paint.Color.valueOf("#e4a593"));
        button9.setTextOverrun(javafx.scene.control.OverrunStyle.CENTER_ELLIPSIS);
        button9.setFont(new Font("System Bold", 48.0));

        group5.setLayoutX(42.0);
        group5.setLayoutY(1.0);

        label5.setLayoutX(678.0);
        label5.setText("O");
        label5.setTextFill(javafx.scene.paint.Color.WHITE);
        label5.setFont(new Font("System Bold", 64.0));

        label6.setLayoutX(636.0);
        label6.setText("X");
        label6.setTextFill(javafx.scene.paint.Color.valueOf("#e4a593"));
        label6.setFont(new Font("System Bold", 64.0));

        label7.setLayoutX(678.0);
        label7.setLayoutY(50.0);
        label7.setText("O");
        label7.setTextFill(javafx.scene.paint.Color.valueOf("#e4a593"));
        label7.setFont(new Font("System Bold", 64.0));

        label8.setLayoutX(636.0);
        label8.setLayoutY(50.0);
        label8.setText("X");
        label8.setTextFill(javafx.scene.paint.Color.WHITE);
        label8.setFont(new Font("System Bold", 64.0));

        group.getChildren().add(button);
        group.getChildren().add(button0);
        getChildren().add(group);
        group0.getChildren().add(circle);
        group0.getChildren().add(label);
        getChildren().add(group0);
        group1.getChildren().add(label0);
        group1.getChildren().add(label1);
        getChildren().add(group1);
        group2.getChildren().add(circle0);
        group2.getChildren().add(label2);
        getChildren().add(group2);
        group3.getChildren().add(label3);
        group3.getChildren().add(label4);
        getChildren().add(group3);
        group4.getChildren().add(rectangle);
        group4.getChildren().add(button1);
        group4.getChildren().add(button2);
        group4.getChildren().add(separator);
        group4.getChildren().add(separator0);
        group4.getChildren().add(separator1);
        group4.getChildren().add(separator2);
        group4.getChildren().add(button3);
        group4.getChildren().add(button4);
        group4.getChildren().add(button5);
        group4.getChildren().add(button6);
        group4.getChildren().add(button7);
        group4.getChildren().add(button8);
        group4.getChildren().add(button9);
        getChildren().add(group4);
        group5.getChildren().add(label5);
        group5.getChildren().add(label6);
        group5.getChildren().add(label7);
        group5.getChildren().add(label8);
        getChildren().add(group5);

    }
}
