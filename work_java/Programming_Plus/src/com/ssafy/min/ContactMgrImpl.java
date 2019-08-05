package com.ssafy.min;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day01.Condition;

public class ContactMgrImpl implements IContactMgr {

	private ContactMgrImpl() { }
	
	private static ContactMgrImpl man1 = new ContactMgrImpl();
	
	public static ContactMgrImpl getInstance()
	{
		return man1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	private ContactMgrImpl() { }
	private static ContactMgrImpl man = new ContactMgrImpl();
	public static ContactMgrImpl getInstanct()
	{
		return man;
	}

	ArrayList<Contact> contactList = new ArrayList<Contact>();

	
	

	
	@Override
	public void add(Contact contact) throws DuplicateContactException {
		// TODO Auto-generated method stub
		boolean flag = false;

		for (Contact c : contactList) {
			if(c.getPhone().equals(contact.getPhone()))
			{
				flag = true;
				break;
			}
		}

		if(flag)
		{
			throw new DuplicateContactException();
		}
		contactList.add(contact);
	}







	//이름에 해당하는 연락처를 찾아서 .. 회사명을 새걸로 바꾸자.
	@Override
	public void update(Contact contact) {
		// TODO Auto-generated method stub
		for(int i = 0; i < contactList.size(); i++)
		{
			if(contactList.get(i).getName().equals(contact.getName()))
			{
				contactList.get(i).setCompany(contact.getCompany());
			}
		}
	}

	@Override
	public void delete(String phone) throws ContactNotFoundException {
		// TODO Auto-generated method stub
		int idx = -1;
		for (int i = 0; i < contactList.size(); i++)
		{
			if(contactList.get(i).equals(phone))
			{
				idx = i;
			}
		}

		if (idx != -1)
			contactList.remove(idx);
		else
		{
			throw new ContactNotFoundException();
		}
	}

	@Override
	public Contact search(String phone) {
		// TODO Auto-generated method stub
		for(int i = 0; i < contactList.size(); i++)
		{
			if(contactList.get(i).getPhone().equals(phone))
			{
				return contactList.get(i);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Contact> search() {
		// TODO Auto-generated method stub
		return contactList;
	}

	@Override
	public void save() {
		ObjectOutputStream oos = null;
		// TODO Auto-generated method stub
		try {
			oos = new ObjectOutputStream(new FileOutputStream("contact.dat"));
			oos.writeObject(contactList);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("contact.dat"));
			contactList = (ArrayList<Contact>) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
		Collections.sort(contactList);
		
//		List<String> list = new ArrayList<>();
//		Collections.sort(list);
//		System.out.println(list);
	}

}
