package com.components;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Attendence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int sid;
	private String attendence;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAttendence() {
		return attendence;
	}
	public void setAttendence(String attendence) {
		this.attendence = attendence;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

}
