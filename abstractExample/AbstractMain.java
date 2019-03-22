package abstractExample;

public class AbstractMain extends AbstractProgram 
{
	@Override
	void displayDetails() 
	{
		System.out.println("Hello");
	}
	
//	void address()
//	{
//		super.address();
//		System.out.println("CH");
//	}
	public static void main(String[] args) 
	{
		AbstractMain am=new AbstractMain();
		am.displayDetails();
		am.address();
	}
}
