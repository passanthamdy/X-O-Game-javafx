package models;

public class Game {
private int game_id;
private String player1;
private String player2;
private int winner;


public Game(int game_id, String player1, String player2, int winner) {
	super();
	this.game_id = game_id;
	this.player1 = player1;
	this.player2 = player2;
	this.winner = winner;
}

public int getGame_id() {
	return game_id;
}
public void setGame_id(int game_id) {
	this.game_id = game_id;
}
public String getPlayer1() {
	return player1;
}
public void setPlayer1(String player1) {
	this.player1 = player1;
}
public String getPlayer2() {
	return player2;
}
public void setPlayer2(String player2) {
	this.player2 = player2;
}
public int getWinner() {
	return winner;
}
public void setWinner(int winner) {
	this.winner = winner;
}
}
