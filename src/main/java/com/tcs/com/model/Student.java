package com.tcs.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	private Integer stdId;
	private String stdName;
	private Double stdFee;
	
	public Student() {
		super();
	}
	public Student(Integer stdId, String stdName, Double stdFee) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdFee = stdFee;
	}
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Double getStdFee() {
		return stdFee;
	}
	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + "]";
	}
	
	
}
