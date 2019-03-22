package sql_example;

import java.sql.*;
import sql_example.OracleConnection;   // importing the class import.packagename.class name; 

public class Callable_example extends OracleConnection
{
	public static void main(String[] args)
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			
//		OracleConnection oc = new OracleConnection();
//		Connection c=oc.getConnection();
		
		CallableStatement cs = con.prepareCall("{?=call add_func(?,?)}");
		cs.registerOutParameter(1, Types.INTEGER);
		cs.setInt(2, 10);
		cs.setInt(3, 30);
		cs.execute();
		System.out.println(cs.getInt(1));
		}
		catch(Exception e)
		{
			System.out.println("error :"+e);
			e.printStackTrace();
		}
	}
}
