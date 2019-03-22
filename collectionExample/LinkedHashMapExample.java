package collectionExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample 
{
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> l = new LinkedHashMap<Integer,String >();
		l.put(100, "dravid");
		l.put(200, "kholi");  
		l.put(300, "sachin");
//		System.out.println("keys"+l.keySet());
//		System.out.println("Val"+l.values());
//		System.out.println("key pairs"+l.entrySet());
		for(Map.Entry m:l.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
