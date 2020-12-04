package project;
import java.sql.*;

public class ConnectionProvider {

	public static Connection getCon()
	{
		try {
			 Class.forName("com.mysql.jdbc.Driver");  
			    Connection con=DriverManager.getConnection(  
			    "Path to database","root","Password");
			    return con;
		}
		catch(Exception e)
		{
			return null;
		}
	}
}
