package collectionExample;

import java.util.HashSet;

public class Student
{
	public static void main(String[] args)
	{
		HashSet<Object> hs=new HashSet<Object>();
		Integer a =new Integer(1);
		String str=new String("Abc");
		hs.add(a);
		hs.add(str);
		First obj = new First(100, "Virat", "CHennai");
		First obj1 = new First(110, "Sachin", "Bangalore");
		hs.add(obj);
		hs.add(obj1);
		System.out.println(hs);
	}
}
