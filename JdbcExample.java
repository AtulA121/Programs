import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcExample
{

	public static void main(String[] args)
	{
		String urlConn="jdbc:mysql://localhost:3306/atul";
		String user="root";
		String pass="A121";
		
		try
		{
			Connection conn=DriverManager.getConnection(urlConn,user,pass);
			System.out.println("Connection successfully :");
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
	}

}
