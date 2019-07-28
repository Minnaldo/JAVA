package com.ssafy.java.hw;

import java.util.Scanner;
import java.util.Stack;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager manager = new BookManager();
		Book[] books = new Book[100];
		Book[] magazine = new Magazine[100];
		
		int index=0;
		int index2=0;
		while(true) {
			System.out.println("1. 데이터 입력 기능 ");
            System.out.println("2. 데이터 전체 검색 기능 ");
            System.out.println("3. Isbn으로 정보를 검색하는 기능");
            System.out.println("4. Title로 정보를 검색하는 기능(파라미터로 주어진 제목을 포함하는 모든 정보");
            System.out.println("5. Book만 검색하는 기능");
            System.out.println("6. Magazine만 검색하는 기능");
            System.out.println("7. 출판사로 검색하는 기능 ");
            System.out.println("8. 가격으로 검색 기능 (파라미터로 주어진 가격보다 낮은 도서 정보 검색)");
            System.out.println("9. 저장된 모든 도서의 금액 합계를 구하는 기능");
            System.out.println("10. 저장된 모든 도서의 금액 평균를 구하는 기능");
            System.out.println("0. 탈출");
			
			Scanner sc = new Scanner(System.in);
			
			int function = sc.nextInt();
			if(function == 0) break;
			
			else if(function == 1) {
				System.out.println("1. book 데이터 입력");
				System.out.println("2. Magazine 데이터 입력");
				int choice = sc.nextInt();
				if(choice == 1) {
					books[index] = new Book(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
					manager.addBook(books[index]);
					index++;
				}
				else if(choice == 2) {
					magazine[index2] = new Magazine(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
					manager.addBook(magazine[index2]);
					index2++;
				}
			}
			else if(function == 2) {
				Book[] book_search = manager.search();
				for(int i=0; i<book_search.length; i++) {
					System.out.println(book_search[i]);
				}
			}
			else if(function == 3) {
				System.out.println(manager.search_isbn(sc.next()));
			}
			else if(function == 4) {
				System.out.println(manager.search_title(sc.next()));
			}
			else if(function == 5) {
				Book[] book_search = manager.search_book();
				for(int i=0; i<book_search.length; i++) {
					System.out.println(book_search[i]);
				}
			}
			else if(function == 6) {
				Book[] book_search = manager.search_magazine();
				for(int i=0; i<book_search.length; i++) {
					System.out.println(book_search[i]);
				}
			}
			else if(function == 7) {
				System.out.println(manager.search_publisher(sc.next()));
			}
			else if(function == 8) {
				Book[] book_underprice = manager.search_price(sc.nextInt());
				for(int i=0; i<book_underprice.length; i++) {
					System.out.println(book_underprice[i]);
				}
			}
			else if(function == 9) {
				System.out.println("sum = " + manager.sum_price());
			}
			else if(function == 10) {
				System.out.println("avg = " + manager.average_price());
			}
			
			
		}
	}
}
/*
1
isbn title author publisher 5000 1
1
isbn1 title1 author1 publisher1 6000 2
1
isbn2 title2 author2 publisher2 7000 3
*/