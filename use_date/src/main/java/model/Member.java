package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Member implements Serializable{
	private int id;	
	private String name;
	private LocalDate birthday;
	
	public Member() {}
	
	public Member(String name, LocalDate birthdayDate) {
		this.name = name;
		this.birthday = birthdayDate;
	}
	
	public Member(int id, String name, LocalDate birthdayDate) {
	
		this.id = id;
		this.name = name;
		this.birthday = birthdayDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}
	
	public int getAge() {
	
		LocalDate today = LocalDate.now();
		return Period.between(birthday, today).getYears();	
	
		
	}
	
}
