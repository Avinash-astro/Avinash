package java_projects;

public class ConstructorExample
{
	int empno;
	String name;
	public static void main(String[] args)
	{
		ConstructorExample ce=new ConstructorExample(100,"abc");
		System.out.println("no:"+ce.empno+"\nname:"+ce.name);
	}
	public ConstructorExample(int empno,String name)
	{
		this.empno=empno;
		this.name=name;
	}
}
