package interfaceExample;

public class InterfaceMain implements Student,Result
{
	@Override
	public void display() 
	{
		System.out.println("ROll no:"+100);
	}

	@Override
	public void result()
	{
		System.out.println("Present");
	}
	
	public static void main(String[] args) 
	{
		InterfaceMain im=new InterfaceMain();
		im.display();
		im.result();
	}
}