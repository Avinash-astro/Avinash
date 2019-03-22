package java_projects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class ComparableExample1 implements Comparable<ComparableExample1>
{
	int id,sal;
	String name,address;

	public ComparableExample1(int id, int sal, String name, String address) 
	{
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
		this.address = address;
	}

	@Override
	public int compareTo(ComparableExample1 o) 
	{
		if(name.equals(o.name))
		{
			return 0;
		}
		else if((name.equals(o.name)))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class ComparableExample
{
	public static void main(String[] args)
	{
		ArrayList<ComparableExample1> al=new ArrayList<ComparableExample1>();
		ComparableExample1 ce1 = new ComparableExample1(400, 95000, "Dravid", "Ch");
		ComparableExample1 ce2 = new ComparableExample1(200, 45000, "rooney", "MI");
		ComparableExample1 ce3 = new ComparableExample1(300, 80000, "Sachin", "Blr");
		al.add(ce1);
		al.add(ce2);
		al.add(ce3);
		Collections.sort(al);
		for(ComparableExample1 a:al)
		{
			System.out.println(a.id+" "+a.name+" "+a.sal+" "+a.address);
		}
	}
}
