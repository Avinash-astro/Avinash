package collectionExample;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Iterator
{

	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		ListIterator li=l1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
