/**
 * 
 */
package com.madhu.jackson.json.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.madhu.jackson.json.demo.Address; 

/**
 * @author 15197
 * POJO Student
 * @JsonIgnoreProperties(ignoreUnknown=true) - We ignored unkown properties
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String active;
	private Address address;
	private String[] languages;
	//private String company;
	
	/**
	 * 
	 */
	public Student() {
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
		this.active = active;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the languages
	 */
	public String[] getLanguages() {
		return languages;
	}
	/**
	 * @param languages the languages to set
	 */
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	/**
	 * @return the company
	 */
	/*
	 * public String getCompany() { return company; }
	 */
	/**
	 * @param company the company to set
	 */
	/*
	 * public void setCompany(String company) { this.company = company; }
	 */
	
}
