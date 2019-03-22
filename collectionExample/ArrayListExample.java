package collectionExample;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(50);
		al.add(60);
		al.add(100);
		al.add(90);
		al.add(10);
		System.out.println(al);
		al.add(3,500);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.set(4, 1000);
		System.out.println(al);
	}
}
