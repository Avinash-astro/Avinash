package java_projects;

import java.util.Scanner;
public class AmstrongNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,val,num,temp,a=sc.nextInt();
		temp=a;
		while(temp>0)
		{
			num=temp%10;
			val=(int) Math.pow(num,3);
			sum=sum+val;
			temp=temp/10;
		}
		if(sum==a)
		{
			System.out.println("Amstrong");
		}
		else
		{
			System.out.println("Not Amstrong");
		}
	}

}
