Feature: Reserve Books
	In order to easily checkout books at the library
	As a user
	I want to place my reservations through the online system 
	
 Scenario: Search for a book
   	Given a book 'Things fall apart' in the library
   	When I search for 'THINGS fall aPaRt'
   	Then I should find the book
   	
   Scenario: Reserve a book
   Given a book 'Things fall apart' in the library
   When I reserve the book
   Then the book should be added to the library's reservations
   	
   	