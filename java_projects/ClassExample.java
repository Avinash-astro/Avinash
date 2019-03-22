package java_projects;

import java.util.Scanner;

public class ClassExample 
{
	int empno;
	String name,address;
	
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		empno=sc.nextInt();
		name=sc.next();
		address=sc.next();
	}
	void display()
	{
		System.out.println("empno:"+empno+"\n"+"name:"+name+"\n"+"address:"+address);
	}
	public static void main(String[] args)
	{
		ClassExample ce=new ClassExample();
		ce.setData();
		ce.display();
	}

}
