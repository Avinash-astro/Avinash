package inheritance_example;

public class Marks extends Student
{
	
	int m1,m2,m3,tot;
	
	public void getData()
	{
		super.getData();
		System.out.println("enter marks for m1,m2,m3.");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
	public void display()
	{
		super.display();
		tot=m1+m2+m3;
		System.out.println("M1:"+m1+"\tm2:"+m2+"\tm3:"+m3+"\nTot:"+tot+"\\300");
	}
	public static void main(String[] args)
	{
		//Student s=new Student();
		Marks m=new Marks();
		//
		m.display();
		//Marks ms=new Student();
		//Student sm=new Marks();
//		sm.getData();
//		sm.display();
		m.getData();
		m.display();
//		s.getData();
//		s.display();
	}
}
