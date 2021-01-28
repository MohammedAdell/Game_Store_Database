import java.sql.*;

public class DBConnect {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnect() {
		try {
			
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			// Change "<ServerName>" to your serverName.
			// to find server name go to sql server (New Query) and type: "SELECT @@ServerName" and you will find it.
			// Change "userName" and "password" to your own user name" and password.
			// if you do not have username and password create a new user in sql server by doing the following:
			// on sql server go to Security -> Logins -> right click on sa and set your password.
			// Now your userName = "sa" and password = your new passsword
			
	    	con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-B1NLQNJ;databaseName=GAME_STORE", "sa", "Qq12344321q");
			st = con.createStatement();
		}
		catch(Exception ex) {
			System.out.println("ERRO: "+ex);
		}
	}
	
	public void getData(String m  ) {
		try {
			//String query = "INSERT INTO GAME (Name, Genre, Age_Limit, Price, Rating, Dname, Ddate) VALUES ('TRY1', 'TRY2', 'TRY3', 60, 8, 'EA SPORTS', '2012-09-29')";
			//String query = "SELECT * FROM GAME_PLATFORMS";
			String query = m ;
			rs = st.executeQuery(query);
			//System.out.println("Games and their platforms");
			
//			while(rs.next()) {
//				String Gname = rs.getString(h);
//				String Gplatform = rs.getString("Gplatform");
//				
//				System.out.println("Game Name: "+Gname+" - Game Platform: "+Gplatform);
//			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
}
