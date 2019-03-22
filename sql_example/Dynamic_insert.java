package sql_example;

import java.sql.*;
import java.util.Scanner;

public class Dynamic_insert
{
	public static void main(String[] args) //throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int id,sal;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			Statement stmt = con.createStatement();
			ResultSet rs ;
			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
			
			id=sc.nextInt();
			name=sc.next();
			sal=sc.nextInt();
			
			//stmt.executeUpdate("insert into emp values("+id+",'"+name+"',"+sal+")");
			ps.setInt(1,id); ps.setString(2,name); ps.setInt(3, sal);
			int res=ps.executeUpdate();
			if(res>=1)
				System.out.println("record inserted");
			else
				System.err.println("record is not created");
//			rs=stmt.executeQuery("select * from emp");
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)); 
//			}
		}
		catch(Exception e)
		{
			System.out.println("error:"+e);
		}
		finally
		{
			System.err.println("Connection closed");
		}
	}
}

