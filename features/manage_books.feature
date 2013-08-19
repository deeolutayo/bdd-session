Feature: Manage Books
  In order to keep tracks of books in my library
  As an Admin
  I want to manage the books in the library system

  Scenario: Add a book
    Given a library
    When I add a book 'Things fall apart' to the library
    Then the book should be available in the library