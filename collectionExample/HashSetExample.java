package collectionExample;

import java.util.HashSet;

public class HashSetExample 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		hs.add(10);
		hs.add(30);
		hs.add(40);
		hs.add(100);
		hs.add(10);
		hs.add(100);
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(100));
		System.out.println(hs.contains(1000));
		hs.remove(10);
		hs.remove(1000);
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.size());
	}
}
