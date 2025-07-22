package model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Period;

public class Member implements Serializable{
	private int id;
	private String name;
	private String address;
	private LocalDate birthday;
	private String  telephone;
	private String gender; 
	private Timestamp createdAt;
	
	public Member() {}
	
	public Member(String name, String address, String  telephone, LocalDate birthday ,String gender, Timestamp createdATimestamp, Timestamp createdAt) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.birthday = birthday;
		this.gender = gender;
		this.createdAt = createdAt;
	}
	
	public Member(int id, String name, String address, String  telephone, LocalDate birthday ,String gender, Timestamp createdATimestamp, Timestamp createdAt) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.birthday = birthday;
		this.gender = gender;
		this.createdAt = createdAt;
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
	public String  getTelephone() {
		return telephone;
	}
	public String getGender() {
		return gender;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	public int getAge() {
		LocalDate today = LocalDate.now();
		return Period.between(birthday, today).getYears();	
	}

	
	
}	
