package Comparable.Book;

import java.util.Arrays;

public class BookDriver  {
	public static void main(String[] args) {
		Book b1=new Book("One indian Girl", 500);
		Book b2=new Book("Monday clg", 1500);
		Book b3=new Book("Ugly Love", 300);
		Book b4=new Book("Eat the frog", 900);
		Book b5=new Book("Hunted", 500);
		Book[] book= {b1,b2,b3,b4,b5};
		
		Arrays.sort(book);
		for(Book b:book) {
			System.out.println(b);
		}
//		for(int i=0;i<book.length;i++{
//			System.out.println(book[i]);
//		}


	}
}
