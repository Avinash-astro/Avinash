package collectionExample;

public class First
{
	int emp;
	String name,address;
	public First(int emp, String name, String address) 
	{
		this.emp = emp;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() 
	{
		return "[emp=" + emp + ", name=" + name + ", address=" + address + "]";
	}
}
