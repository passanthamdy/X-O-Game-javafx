package model;
import model.DatabaseCon;
import java.sql.*;

public class DatbaseSt{
	private Connection con;
	private PreparedStatement pst;
	//private ResultSet rs;
	
	public DatbaseSt() {
		DatabaseCon dbcon =new  DatabaseCon();
		con =dbcon.startConnection();
	}
	
	
	public void insertIntoPlayer(String ur ,String ps) {
		try {

			pst = con.prepareStatement("insert into Player(username,password) values(?,?)");
			pst.setString(1, ur);
			 pst.setString(2, ps);
			 pst.executeUpdate();
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("start con failed33");		}
	}
	
	public ResultSet SelectPlayer(int player_id) {
        try {

			pst =con.prepareStatement("Select * from Player where player_id = ? ");
			pst.setInt(1,player_id);
			ResultSet rs=pst.executeQuery();
			rs.next();
			return rs;
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid ID for player");
		}
		
	
	return null;
					}
	public ResultSet listRecGames() {
		try {
			pst = con.prepareStatement("Select * from RecordedGames ");
			ResultSet rs = pst.executeQuery();
			return rs;
		}catch(SQLException ex) {
			System.out.println("No Games listed");
		}
		
		return null;
	}
	

	

}