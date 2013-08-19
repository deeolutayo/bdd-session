package bdd;

import static org.junit.Assert.*;
import org.junit.Test;

import bdd.Book;

public class BookTest {
	
	@Test
	public void shouldBeEqualWhenSameBookInstance(){
		Book sameBook = new Book("cloned book");
		assertTrue(sameBook.equals(sameBook));
	}

	@Test
	public void shouldNotBeEqualWhenOtherObjectIsNull() {
		assertFalse((new Book("").equals(null)));
	}
	
	@Test
	public void shouldNotEqualIfTitlesDiffer(){
		Book book = new Book("awesome book");
		Book otherBook = new Book("not-so awesome book");
		
		assertFalse(book.equals(otherBook));
	}
	
	@Test
	public void shouldBeEqualIfTitlesAreEqualIgnoringCase(){
		Book book = new Book("THE curious case");
		Book otherBook = new Book("the Curious CaSE");
		
		assertTrue(book.equals(otherBook));
	}
}
