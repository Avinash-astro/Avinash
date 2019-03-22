package inheritance_example;

public class M1 extends S1
{
	
	int m1,m2,m3,tot;
	
	M1(int no,String name,String address,int m1,int m2,int m3)
	{
		super(no,name,address);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void display()
	{
		super.display();
		tot=m1+m2+m3;
		System.out.println("M1:"+m1+"\tm2:"+m2+"\tm3:"+m3+"\nTot:"+tot+"\\300");
	}
	public static void main(String[] args)
	{
		M1 m=new M1(10,"abc","ch",100,90,80);
		m.display();
	}
}
