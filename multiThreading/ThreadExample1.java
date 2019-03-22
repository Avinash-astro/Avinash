package multiThreading;


class ThreadDemo implements Runnable
{
	public void run() 
	{
		try 
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class ThreadExample1 {

	public static void main(String[] args)
	{
		ThreadDemo a = new ThreadDemo();
		ThreadDemo b = new ThreadDemo();
		ThreadDemo c = new ThreadDemo();
		
		Thread t1= new Thread(a);
		Thread t2= new Thread(b);
		Thread t3= new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}

}
