package abstractExample;

 abstract class AbsProgram 
{
	int empno;
	String name,address;
	public AbsProgram(int empno,String name,String address)
	{
		
		this.empno=empno;
		this.name=name;
		this.address=address;
	}
	abstract void details();
}
