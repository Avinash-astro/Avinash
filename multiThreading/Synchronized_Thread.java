package multiThreading;

class a implements Runnable 
{
	synchronized public void run()
	{
		try 
		{
			Thread t = Thread.currentThread();
			String name=t.getName();
			for(int i=0;i<10;i++)
			{
				System.out.println(name+":"+i);
				Thread.sleep(500);
				if(name.equals("a") && i==4)
				{
					//System.out.println(name+":"+i);
					wait();
				}
				if(name.equals("b") && i==4)
				{
					//System.out.println(name+":"+i);
					wait();
				}
				if(name.equals("c") && i==6)
				{
					System.out.println("Both threads started");
					notifyAll();
				}
				if(name.equals("b") && i==9)
				{
					System.out.println("old thread started");
					notify();
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}


public class Synchronized_Thread
{
	public static void main(String[] args) throws Exception
	{
		a obj = new a();
		
		Thread t1= new Thread(obj,"a");
		Thread t2= new Thread(obj,"b");
		Thread t3= new Thread(obj,"c");
		t1.start();
		t2.start();
		t3.start();
	}
}
