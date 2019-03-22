package assignment1;

public class Employee 
{
	private int no,sal;
	private String name;
	private Address address;
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}
	public int getNo()
	{
		return no;
	}
	public void setNo(int no) 
	{
		this.no = no;
	}
	public int getSal()
	{
		return sal;
	}
	public void setSal(int sal) 
	{
		this.sal = sal;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
}
