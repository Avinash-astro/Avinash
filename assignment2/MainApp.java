package assignment2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import assignment2.OracleConnection;
public class MainApp
{
	public static void main(String[] args) 
	{
		Pojo p = new Pojo(0, 0, null, null);
		int id=0,sal=0,check=0;
		String name=null,email=null;
		Scanner sc= new Scanner(System.in);
		Connection con=null;
		try
		{
			con= OracleConnection.getConnection();
			System.out.println("1. select, 2.insert, 3.update, 4.delete..");
			int ch= sc.nextInt();
			switch(ch)
			{
			case 1:
				{
					Statement stmt= con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from emp_app");
					while(rs.next())
					{
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
					}
					break;
				}
			case 2:
				{
					System.out.println("enter id,name,mail,sal.. to ins");
					id=sc.nextInt();
					name=sc.next();
					email=sc.next();
					sal=sc.nextInt();
					Pojo p1= new Pojo(id, sal, name, email);
					String ins="insert into emp_app (id,name,email,sal) values(?,?,?,?)"; 
					PreparedStatement ps=con.prepareStatement(ins);
					ps.setInt(1,p1.getEmpid());
					ps.setString(2, p1.getName());
					ps.setString(3, p1.getEmail());
					ps.setInt(4, p1.getSal());
					check=ps.executeUpdate();
					if(check!=0)
						System.out.println("record inserted");
					else
						System.out.println("error ");
					break;
				}
			case 3:
				{
					System.out.println("enter the id of the emp to change name");
					id=sc.nextInt();
					name=sc.next();
					sal=sc.nextInt();
					Pojo p1= new Pojo(id, sal, name, email);
					String update="update emp_app set name=? , sal=? where id=?"; 
					PreparedStatement ps=con.prepareStatement(update);
					ps.setString(1, p1.getName());
					ps.setInt(2, p1.getSal());
					ps.setInt(3,p1.getEmpid()); 
					check=ps.executeUpdate();
					if(check!=0)
						System.out.println("record updated");
					else
						System.out.println("error ");
					break;
				}
			case 4:
				{
					System.out.println("enter id to del.");
					id=sc.nextInt();
					//Pojo p1= new Pojo(id, sal, name, email);
					String del= "delete from emp_app where id=?";
					PreparedStatement ps=con.prepareStatement(del);
					p.setEmpid(id);
					ps.setInt(1,p.getEmpid());
					check=ps.executeUpdate();
					if(check!=0)
						System.out.println("record deleted");
					else
						System.out.println("error ");
					break;
				}
			default:
				System.out.println("enter val from 1-4 ");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
		
	}
}
