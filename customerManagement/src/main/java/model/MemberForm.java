package model;

import java.io.Serializable;
import java.time.LocalDate;

public class MemberForm implements Serializable{
	private int id;
	private String name;
	private String address;
	private LocalDate birthday;
	private String  telephone;
	private String gender;
	public MemberForm(int id, String name, String address, LocalDate birthday, String telephone, String gender) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.birthday = birthday;
		this.telephone = telephone;
		this.gender = gender;
	} 
	
	public MemberForm(String name, String address, LocalDate birthday, String telephone, String gender) {
		this(0, name, address, birthday, telephone, gender);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getGender() {
		return gender;
	}
	
	

}
