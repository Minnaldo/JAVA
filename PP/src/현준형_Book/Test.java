package com.ssafy.ws.adjava04;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		new Dispatcher();
	}

	static void printAllBooks(List<Book> list) {
		for (Book b : list) {
			System.out.println(b);
		}
	}
	
	static void printAllAuthors(List<Author> list) {
		for (Author a : list) {
			System.out.println(a);
		}
	}
}