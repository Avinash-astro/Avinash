package sql_example;

import java.sql.*;
import java.util.Scanner;

public class Sql_demo 
{
	public static void main(String[] args) //throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int id,sal;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// load the driver into memory
			
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@myhost:1521:XE","system","tiger");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			//create conn (Connection -> interface ,DM ->class)
			
			Statement stmt = con.createStatement();
			// stmt -> interface
			
			ResultSet rs ;
			
			//stmt.execute("create table emp(id number primary key,name varchar2(10), sal number)");
			
//			id=sc.nextInt();
//			name=sc.next();
//			sal=sc.nextInt();
			
			//stmt.executeUpdate("insert into emp values("+id+",'"+name+"',"+sal+")");
			//System.out.println("data inserted");
			//System.out.println("table created");
			
			int res=stmt.executeUpdate("update emp set name='Stark' where id=100");
			if(res>=1)
				System.out.println("record updated");
			else
				System.out.println("Error in updating record");
//			rs=stmt.executeQuery("select * from emp");
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)); 
//			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
