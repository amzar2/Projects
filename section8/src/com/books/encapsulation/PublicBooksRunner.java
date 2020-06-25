package com.books.encapsulation;

public class PublicBooksRunner {

	public static void main(String[] args) {
		
		
		
		PublicBooks accounting = new PublicBooks();
		
		PublicBooks calculus = new PublicBooks ();
		
		PublicBooks mathematics = new PublicBooks ();
		 
		accounting.setCopies(100);
		calculus.setCopies(120);
		mathematics.setCopies(50);
		
		accounting.setCopies(50);
		calculus.setCopies(60);
		mathematics.setCopies(25);
		
		
		
		
		mathematics.read();
		calculus.read();
		accounting.read();

	}

}