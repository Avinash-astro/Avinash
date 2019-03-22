package collectionExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionEx
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> ts=new LinkedHashSet<String>();
		ts.add("levine");
		ts.add("adam");
		ts.add("Rooney");
		System.out.println(ts);
		Iterator<String> it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(String str:ts)
		{
			System.out.println(str);
		}
	} 
}
