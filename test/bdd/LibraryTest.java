package bdd;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import bdd.Book;
import bdd.Library;
import bdd.User;

public class LibraryTest {
	
	private Library library;

	@Before
	public void setUp(){
		this.library = new Library();
	}

	@Test
	public void shouldAddBookToLibraryCatalog() {
		Book aBook = new Book("...");
		library.add(aBook);

		assertTrue(library.hasBook(aBook));
	}
	
	@Test
	public void shouldFindExistingBookByTitle(){
		String title = "Tale of two cities";
		Book existingBook = new Book(title);
		library.add(existingBook);
		
		assertThat(library.findBook(title), is(existingBook));
	}
	
	@Test
	public void shouldAddBookToReservations(){
		Book book = new Book("...");
		library.reserveForUser(book, new User());
		
		assertTrue(library.reservationExistsOn(book));
	}
}
