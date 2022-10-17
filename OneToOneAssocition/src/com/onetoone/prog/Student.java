package com.onetoone.prog;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int sid;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address adrees;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdrees() {
		return adrees;
	}

	public void setAdrees(Address adrees) {
		this.adrees = adrees;
	}

	public Student(int sid, String name, Address adrees) {
		this.sid = sid;
		this.name = name;
		this.adrees = adrees;
	}

	public Student() {

	}
	
	
	
	

}
