package sql_example;

import java.sql.*;

public class SqlDemo
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			CallableStatement cs = con.prepareCall("call add_val(?,?,?)");
			cs.setInt(1, 10);
			cs.setInt(2, 20);
			cs.registerOutParameter(3,Types.INTEGER);
			cs.execute();
			int n=cs.getInt(3);
			System.out.println(n);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
