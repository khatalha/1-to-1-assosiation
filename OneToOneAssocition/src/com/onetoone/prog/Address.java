package com.onetoone.prog;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int aid;
	private String street;
	private String country;
	private int zipcode;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public Address(int aid, String street, String country, int zipcode) {
		
		this.aid = aid;
		this.street = street;
		this.country = country;
		this.zipcode = zipcode;
	}
	public Address() {
	
	}
	
	
	
	

}
