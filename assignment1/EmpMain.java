package assignment1;

public class EmpMain 
{
	public static void main(String [] args)
	{
		
		Address ad=new Address();
		ad.setStreet_no(97);
		ad.setCity("Ch");
		ad.setState("TN");		
		 
		Employee emp=new Employee();
		emp.setNo(100);
		emp.setName("Abc");
		emp.setSal(40000);
		emp.setAddress(ad);
		
		
		//System.out.println(emp.getAddress().street_no+","+emp.getAddress().city+","+emp.getAddress().state);
		System.out.println("Id:"+emp.getNo()+"\nempName:"+emp.getName()+"\nempsal:"+emp.getSal());
		//System.out.println("Street no:"+ad.getStreet_no()+"\nCity:"+ad.getCity()+"\nState:"+ad.getState());
		System.out.println(emp.getAddress());
	}
}
