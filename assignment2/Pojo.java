package assignment2;

public class Pojo 
{
	private int empid,sal;
	private String name,email;
	
	public Pojo(int empid, int sal, String name, String email)
	{
		this.empid = empid;
		this.sal = sal;
		this.name = name;
		this.email = email;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
