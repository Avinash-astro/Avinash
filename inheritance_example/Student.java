package inheritance_example;

import java.util.Scanner;

public class Student
{
	int no;
	String name,address;
	Scanner sc=new Scanner(System.in);
	
	public void getData()
	{
		System.out.println("enter no,name,address.");
		no=sc.nextInt();
		name=sc.next();
		address=sc.next();
	}
	public void display()
	{
		System.out.println("no:"+no+"\nName:"+name+"\nAddress:"+address);
	}
}
