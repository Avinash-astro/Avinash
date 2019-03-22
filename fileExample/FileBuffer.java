package fileExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FileBuffer 
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the id");
		int empid=Integer.parseInt(br.readLine());
		System.out.println("enter the name");
		String empname=br.readLine();
		System.out.println("enter the emp sal");
		float empsal=Float.parseFloat(br.readLine());
		System.out.println("id:"+empid);
		System.out.println("name:"+empname);
		System.out.println("sal:"+empsal);
	}

}
