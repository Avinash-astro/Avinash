package collectionExample;

import java.util.*;

class Emp
{
		int id,sal;
		String name,address;
		public Emp(int id, int sal, String name, String address)
		{
			super();
			this.id = id;
			this.sal = sal;
			this.name = name;
			this.address = address;
		}
}
public class EmpMain
{
		public static void main(String[] args) 
		{
			Map<Integer,Emp> map = new LinkedHashMap<Integer,Emp>(); // upcasting 
			Emp e1=new Emp(100,30000,"Dhoni","Ch");
			Emp e2=new Emp(200,40000,"Kholi","Mi");
			Emp e3=new Emp(300,50000,"Virat","Blr");
			map.put(1, e1);
			map.put(2, e2);
			map.put(3, e3);
			
			for(Map.Entry<Integer, Emp> entry :map.entrySet())
			{
				int key=entry.getKey();
				Emp e = entry.getValue();
				System.out.println("Record:"+key);
				System.out.println(e.id+" "+e.name+" "+e.sal+" "+e.address);
			}
			
		}
}
