package com.ssafy.min;

import java.io.Serializable;

public class Contact implements Serializable, Comparable<Contact>{
	private String phone;
	private String name;
	private String Company;
	
	public Contact() { }
	
	public Contact(String phone, String name, String company) {
		super();
		this.phone = phone;
		this.name = name;
		Company = company;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", name=" + name + ", Company=" + Company + "]";
	}

	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		if (this.name.compareTo(o.phone) == 0 )
		{
			return this.phone.compareTo(o.phone);
		}
		
		return this.name.compareTo(o.name);
	}
	
	
}
