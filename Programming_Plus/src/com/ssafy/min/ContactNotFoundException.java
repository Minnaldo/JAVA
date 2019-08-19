package com.ssafy.min;

public class ContactNotFoundException extends Exception {
	public ContactNotFoundException ()
	{
		super("연락처 없음");				
	}
}
