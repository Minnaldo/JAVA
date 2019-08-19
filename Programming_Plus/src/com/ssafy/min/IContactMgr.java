package com.ssafy.min;

import java.util.ArrayList;
import java.util.List;

public interface IContactMgr {
	public void add(Contact contact) throws DuplicateContactException;
	public void update(Contact contact);
	public void delete(String phone) throws ContactNotFoundException;
	public Contact search(String phone);
	public ArrayList<Contact> search();
	
	public void sort();
	public void save();
	public void open();
	
	
}
