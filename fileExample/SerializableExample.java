package fileExample;

import java.io.*;

class emp implements Serializable
{
	String name;
	public String address;
	public transient int ssn;
	public int no;
}

public class SerializableExample
{
	public static void main(String[] args) 
	{
		emp e = new emp();
		e.name="abc";
		e.address="chennai";
		e.ssn=1010;
		e.no=1;
		try 
		{
			FileOutputStream fos = new FileOutputStream("w.txt");
			ObjectOutputStream out= new ObjectOutputStream(fos);
			
		}
//		catch(ClassNotFoundException c)
//		{
//			c.printStackTrace();
//		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		catch(Exception err)
		{
			System.out.println();
		}
	}
}


