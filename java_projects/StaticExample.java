package java_projects;

public class StaticExample 
{
	static int a=10,b=30; // global variables
	int c;  // we cannot access a non static variable inside a static block
	
	static int sum(int a, int b)
	{
		return a+b;
	}
	
	static  // satic block gets executed without callings
	{
		System.out.println("in static");
	}
	
	static void inc()
	{
		System.out.println(a++);
	}
	public static void main(String[] args)
	{
		System.out.println(sum(a,b));
		inc();
		inc();
		inc();
		inc();
		inc();
		System.out.println(sum(a,b));
	}
}
