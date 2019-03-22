package collectionExample;
import java.util.*;
public class VectorExample {

	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add(10);
		v.add(30);
		v.add(80);
		v.add(90);
		v.add(10);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}  
	}

}
