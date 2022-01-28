package models;
import javafx.scene.control.Button;
public class Player {
	private int player_id;
	private String username;
	private String password;
	private int total_games;
	private int score;
	private String status;
        
        //private Button request;
	public Player(int player_id, String username, String password, int total_games, int score, String status) {
		super();
		this.player_id = player_id;
		this.username = username;
		this.password = password;
		this.total_games = total_games;
		this.score = score;
		this.status = status;
	}



        /*Constructor to PlayersList*/
    public Player(int player_id, String username, int score, String status) {
		super();
                this.player_id = player_id;
		this.username = username;
		this.score = score;
		this.status = status;
                //this.request = request;
	}





	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getTotal_games() {
		return total_games;
	}
	public void setTotal_games(int total_games) {
		this.total_games = total_games;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
