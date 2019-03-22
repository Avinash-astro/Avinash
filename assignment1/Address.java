package assignment1;

public class Address
{
	private int street_no;
	private String city,state;
	
	public int getStreet_no() {
		return street_no;
	}
	public void setStreet_no(int street_no) {
		this.street_no = street_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [street_no=" + street_no + ", city=" + city + ", state=" + state + "]";
	}
	
}
