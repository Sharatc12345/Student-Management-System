package com.components;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentResult {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int sid;
	private String SubjectName;
	private int maxMarks;
	private  int minMarks;
	private  int maxInternal;
	private int minInternal;
	private int maxtmarks;
	private  int mintMarks;
	private int grand_Total;
	private Double percentage;
	private String result;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public  void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	public int getMinMarks() {
		return minMarks;
	}
	public void setMinMarks(int minMarks) {
		this.minMarks = minMarks;
	}
	public int getMaxInternal() {
		return maxInternal;
	}
	public void setMaxInternal(int maxInternal) {
		this.maxInternal = maxInternal;
	}
	public int getMinInternal() {
		return minInternal;
	}
	public void setMinInternal(int minInternal) {
		this.minInternal = minInternal;
	}
	public int getMaxtmarks() {
		return maxtmarks;
	}
	public void setMaxtmarks(int maxtmarks) {
		this.maxtmarks = maxtmarks;
	}
	public int getMintMarks() {
		return mintMarks;
	}
	public void setMintMarks(int mintMarks) {
		this.mintMarks = mintMarks;
	}
	public int getGrand_Total() {
		return grand_Total;
	}
	public void setGrand_Total(int grand_Total) {
		this.grand_Total = grand_Total;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

}
