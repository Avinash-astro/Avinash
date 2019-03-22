package java_projects;

import java.util.Scanner;

public class demo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,j,k=6,a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
//		if(a>b && a>c)
//			System.out.println("a is big:"+a);
//		else if(b>a && b>c)
//			System.out.println("b is big:"+b);
//		else if(c>a && c>b)
//			System.out.println("c is big:"+c);
		for(i=1;i<=10;i++)
		{
			System.out.println(k+"*"+i+"="+k*i);
			if(i==10 && k==6)
			{	
				k=7;
				i=0;
			}
			else if(i==10 && k==7)
			{
				k=8;
				i=0;
			}
			else if(i==10 && k==8)
			{	
				k=9;
				i=0;
			}
			else if(i==10 && k==9)
			{
				k=10;
				i=0;
			}
			else if(i==10 && k==10)
				System.exit(0);
		}
	}
}
