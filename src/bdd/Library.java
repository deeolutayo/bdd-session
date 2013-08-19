package bdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
	
	private List<Book> catalog;
	private Map<Book, User> reservations;
	
	public Library(){
		this.catalog = new ArrayList<Book>();
		this.reservations = new HashMap<Book, User>();
	}

	public void add(Book book){
		this.catalog.add(book);
	}
	
	public boolean hasBook(Book book) {
		return catalog.contains(book);
	}
	
	public Book findBook(String title){
		int index = catalog.indexOf(new Book(title));
		return catalog.get(index);
	}
	
	public void reserveForUser(Book book, User user){
		reservations.put(book, user);
	}
	
	public boolean reservationExistsOn(Book book){
		return reservations.containsKey(book);
	}
}
