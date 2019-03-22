package multiThreading;

public class ThreadExample extends Thread 
{

		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				try
				{
					System.out.println(i);
					sleep(500);
					if(i==5)
						System.out.println(Thread.currentThread());
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args)
		{
			ThreadExample t1 = new ThreadExample();
			ThreadExample t2 = new ThreadExample();
			ThreadExample t3 = new ThreadExample();
			t1.start();
			t2.start();
			t3.start();
		}
}
