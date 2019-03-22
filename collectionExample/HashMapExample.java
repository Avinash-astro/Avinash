package collectionExample;

import java.util.HashMap;

public class HashMapExample 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> h= new HashMap<Integer,String>();
		h.put(100,"rooney");
		h.put(200,"Sachin");
		h.put(300,"Dravid");
		h.put(400,"Adam");
		h.put(null,"Adam");
		System.out.println(h);
		h.remove(100);
		System.out.println(h);
		h.remove(200, "Sachin");
		System.out.println(h);
	}

}
