package inheritance_example;

import java.util.Scanner;

public class S1
{
	int no;
	String name,address;
	Scanner sc=new Scanner(System.in);
	

	public S1(int no, String name, String address) 
	{
//		super();
		this.no = no;
		this.name = name;
		this.address = address;
	}
	public void display()
	{
		System.out.println("no:"+no+"\nName:"+name+"\nAddress:"+address);
	}
}
