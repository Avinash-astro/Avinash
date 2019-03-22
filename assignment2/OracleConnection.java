package assignment2;

import java.sql.*;

public class OracleConnection
{
	private static Connection con;
	public static Connection getConnection() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		return con;
	}
}
