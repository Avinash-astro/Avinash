package sql_example;

import java.util.*;

public class Player
{
	private int id,age;
	private String name,teamName,gender,email;
	private long contact;
	private Date dob;
	
	public Player() 
	{
		System.out.println("class object created");
	}

	public Player(int id, int age, String name, String teamName, String gender, String email, long contact, Date dob) 
	{
		this.id = id;
		this.age = age;
		this.name = name;
		this.teamName = teamName;
		this.gender = gender;
		this.email = email;
		this.contact = contact;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
