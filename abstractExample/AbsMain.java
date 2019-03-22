package abstractExample;

public class AbsMain extends AbsProgram
{
	int sal;
	public AbsMain(int empno, String name, String address,int sal)
	{
		super(empno, name, address);
		this.sal=sal;
	} 
	@Override
	void details()
	{ 
		System.out.println("Empno:"+empno+"\tName:"+name+"\tAddrss:"+address+"\tSal:"+sal);
		System.out.println("Mphasis");
	}
	public static void main(String[] args) 
	{
		AbsMain am=new AbsMain(100, "abc", "Ch",35000);
		am.details();
	}
}
