package sql_example;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import sql_example.OracleConnection;   // importing the class-- import.packagename.class name;
public class playerApp 
{
	public static void main(String[] args) throws Exception
	{
		String dob="01.09.1997";
		Date d= new SimpleDateFormat("dd.MM.yyyy").parse(dob);
		Player p = new Player();
		Player p1 = new Player(110, 22, "Dhoni", "csk", "male", "csk@gmail.com", 1234567890,d);
		System.out.println("Data inserted");
		Connection con = null;
		try 
		{
			con=OracleConnection.getConnection() ;
			String s="insert into player(id,age,name,teamName,gender,email,contact,dob)"+"values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps= con.prepareStatement(s);
			ps.setInt(1, p1.getId());
			ps.setInt(2, p1.getAge());
			ps.setString(3, p1.getName());
			ps.setString(4, p1.getTeamName());
			ps.setString(5, p1.getGender());
			ps.setString(6, p1.getEmail());
			ps.setLong(7, p1.getContact());
			ps.setDate(8, new java.sql.Date( p1.getDob().getTime())); 
			int count=ps.executeUpdate();
			System.out.println(count+" record inserted");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
