package com.ssafy.min;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContactTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ContactMgrImpl manager = ContactMgrImpl.getInstanct();
		Contact contact = null;
		
				
		while(true)
		{
			System.out.println("1. 연락처 추가");
			System.out.println("2. 연락처 삭제");
			System.out.println("3. 연락처 수정");
			System.out.println("4. 연락처 검색");
			System.out.println("5. 모든 연락처");
			System.out.println("0. 종료");
			
			int sel = sc.nextInt();
			
			if(sel == 0)
				break;
			else if(sel == 1)
			{
				System.out.println("추가하실 연락처, 이름, 회사명을 입력하세요.");
				contact = new Contact(sc.next(), sc.next(), sc.next());
				try {
					manager.add(contact);
				} catch (DuplicateContactException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else if(sel == 2)
			{
				//이름 받아서 삭제함수에게 고고
				System.out.println("폰번 뭐야? ");
				String phone = sc.next();
				try {
					manager.delete(phone);
				} catch (ContactNotFoundException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
					System.out.println("그런애 없어요");
				}
			}
			else if(sel == 3)
			{
				//필요한 애들을 받아서.. update에 던져주라
				System.out.println("이름?  ");
				String name = sc.next();
				System.out.println("회사?  ");
				String company = sc.next();
				contact = new Contact("", name, company);
				manager.update(contact);
			}
			else if(sel == 4)
			{
				System.out.println("폰번?   ");
				String phone = sc.next();
				contact = manager.search(phone);
				System.out.println(contact);
			}
			else if(sel == 5)
			{
				for (Contact c : manager.search()) {
					System.out.println(c);
				}
			}
			
			else if (sel == 6)
			{
				
				//Collections.sort(manager.search());
				manager.sort();
				for (Contact c : manager.search()) {
					System.out.println(c);
				}
				
			}
			
		}
		
	}

}
