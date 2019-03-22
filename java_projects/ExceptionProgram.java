package java_projects;

import java.util.Scanner;

public class ExceptionProgram {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			int b,a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Error is "+ae);
		}
		catch(Exception e)
		{
			System.err.println("Error "+e);
		}
		finally
		{
			sc.close();
			System.err.print("Program exits..");
		}
	}
}
