package controllers;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class ListGamesController {
	@FXML
	private Label lbPoints;
	@FXML
	private Label lbUsername;
	@FXML
	private Button btnLogout;
	@FXML
	private Button btnHome;
	@FXML
	private TableView tvListGames;
	@FXML
	private TableColumn player1Col;
	@FXML
	private TableColumn player2Col;
	@FXML
	private TableColumn winnerCol;
	@FXML
	private TableColumn replayBtn;

}
