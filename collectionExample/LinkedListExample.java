package collectionExample;

import java.util.LinkedList;

public class LinkedListExample
{
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		l2.add(10);
		l2.add(200);
		l2.add(300);
		l2.add(400);
		l1.add(10);
		l1.add(40);
		l1.add(10);
		l1.add(80);
		l1.add(90);
		System.out.println(l1);
		System.out.println(l2);
		l1.addFirst(100);
		System.out.println(l1);
		l1.addLast(200);
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		System.out.println(l1.getFirst());
		l1.addAll(l2);
		System.out.println(l1);
		//l1.add(1,1000);
		l1.set(1, 1000);
		System.out.println(l1);
	}
}
